package com.therigy.apache.hop.extensionpoints.script.db;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "DatabaseDisconnectedScript",
  extensionPointId = "DatabaseDisconnected",
  description = "Executes script(s) when a database connection is disconnected"
)
public class DatabaseDisconnectedExecutor extends BaseExtensionPointExecutor {

  public DatabaseDisconnectedExecutor() {
    super( "DatabaseDisconnected" );
  }
}
