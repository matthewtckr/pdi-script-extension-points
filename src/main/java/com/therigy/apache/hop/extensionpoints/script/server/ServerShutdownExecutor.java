package com.therigy.apache.hop.extensionpoints.script.server;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "CarteShutdownScript",
  extensionPointId = "CarteShutdown",
  description = "Executes script(s) when a Carte instance is shut down"
)
public class ServerShutdownExecutor extends BaseExtensionPointExecutor {

  public ServerShutdownExecutor() {
    super( "CarteShutdown" );
  }
}
