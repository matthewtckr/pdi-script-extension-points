package com.therigy.apache.hop.extensionpoints.script;

import org.apache.hop.core.exception.HopException;
import org.apache.hop.core.extension.IExtensionPoint;
import org.apache.hop.core.logging.ILogChannel;
import org.apache.hop.core.variables.IVariables;

import javax.script.Bindings;
import javax.script.SimpleBindings;

public abstract class BaseExtensionPointExecutor implements IExtensionPoint<Object> {

  protected PluginScriptUtil scriptUtil = new PluginScriptUtil();

  public BaseExtensionPointExecutor( String extensionPointId ) {
    scriptUtil.loadScripts( extensionPointId );
  }

  @Override
  public void callExtensionPoint( ILogChannel logChannelInterface, IVariables variables, Object o ) throws HopException {
    Bindings b = new SimpleBindings();
    b.put( "_log_", logChannelInterface );
    b.put( "_object_", o );
    try {
      scriptUtil.runScripts( b );
    }
    catch(Exception e) {
      logChannelInterface.logError( "Error executing extension point script", e );
    }
  }
}
