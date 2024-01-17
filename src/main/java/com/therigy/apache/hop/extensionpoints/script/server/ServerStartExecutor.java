package com.therigy.apache.hop.extensionpoints.script.server;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "CarteStartupScript",
  extensionPointId = "CarteStartup",
  description = "Executes script(s) when a Carte instance is started"
)
public class ServerStartExecutor extends BaseExtensionPointExecutor {

  public ServerStartExecutor() {
    super( "CarteStartup" );
  }
}
