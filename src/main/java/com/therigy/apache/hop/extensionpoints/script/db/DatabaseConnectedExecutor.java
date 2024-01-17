package com.therigy.apache.hop.extensionpoints.script.db;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "DatabaseConnectedScript",
  extensionPointId = "DatabaseConnected",
  description = "Executes script(s) when a database connection is made"
)
public class DatabaseConnectedExecutor extends BaseExtensionPointExecutor {

  public DatabaseConnectedExecutor() {
    super( "DatabaseConnected" );
  }
}
