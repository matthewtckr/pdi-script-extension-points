package com.therigy.apache.hop.extensionpoints.script;

import org.apache.hop.core.exception.HopException;

import javax.script.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PluginScriptUtil {

  protected List<Script> scriptList;

  public PluginScriptUtil() {
    scriptList = new ArrayList<Script>();
  }

  public void loadScripts( final String pluginId ) {
    if ( Thread.currentThread().getContextClassLoader() == null ) {
      Thread.currentThread().setContextClassLoader( this.getClass().getClassLoader() );
    }
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager( Thread.currentThread().getContextClassLoader() );
    File pluginPath =
      new File( this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath() ).getParentFile();
    if ( pluginPath.exists() ) {

      List<ScriptEngineFactory> factories = scriptEngineManager.getEngineFactories();
      if ( factories != null ) {
        for ( ScriptEngineFactory factory : factories ) {
          List<String> extensions = factory.getExtensions();
          if ( extensions != null ) {
            for ( final String extension : extensions ) {

              File[] pluginScripts = pluginPath.listFiles(
                new FilenameFilter() {
                  @Override
                  public boolean accept( File dir, String name ) {
                    return name != null && name.startsWith( pluginId ) && name.endsWith( "." + extension );
                  }
                }
              );
              if ( pluginScripts != null ) {
                for ( File pluginScript : pluginScripts ) {
                  try {
                    ScriptEngine scriptEngine = factory.getScriptEngine();
                    if ( scriptEngine != null ) {

                      BufferedReader reader = new BufferedReader( new FileReader( pluginScript ) );
                      if ( scriptEngine instanceof Compilable ) {
                        Compilable compilable = (Compilable) scriptEngine;
                        scriptList.add( new Script( compilable.compile( reader ) ) );
                      } else {

                        String line = null;
                        StringBuilder stringBuilder = new StringBuilder();
                        String ls = System.getProperty( "line.separator" );

                        while ( ( line = reader.readLine() ) != null ) {
                          stringBuilder.append( line );
                          stringBuilder.append( ls );
                        }
                        scriptList.add( new Script( scriptEngine, stringBuilder.toString() ) );
                      }

                    }

                  } catch ( Exception e ) {
                    // TODO - log error?
                    e.printStackTrace( System.err );
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public void runScripts( Bindings b ) throws HopException {
    if ( scriptList != null ) {
      for ( Script script : scriptList ) {
        ScriptEngine scriptEngine = script.getScriptEngine();

        Bindings currentBindings = scriptEngine.getBindings( ScriptContext.ENGINE_SCOPE );
        if(currentBindings == null) {
          currentBindings = new SimpleBindings();
        }
        currentBindings.putAll( b );
        script.setBindings( currentBindings );
        try {
          script.eval();
        } catch ( ScriptException se ) {
          throw new HopException( se );
        }
      }
    }
  }

  public List<Script> getScriptList() {
    return scriptList;
  }

  public void setScriptList( List<Script> scriptList ) {
    this.scriptList = scriptList;
  }
}
