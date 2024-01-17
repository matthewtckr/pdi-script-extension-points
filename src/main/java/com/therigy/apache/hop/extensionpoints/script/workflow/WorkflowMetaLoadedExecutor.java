package com.therigy.apache.hop.extensionpoints.script.workflow;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowMetaLoadedScript",
  extensionPointId = "WorkflowMetaLoaded",
  description = "Executes script(s) when workflow metadata is loaded"
)
public class WorkflowMetaLoadedExecutor extends BaseExtensionPointExecutor {

  public WorkflowMetaLoadedExecutor() {
    super( "WorkflowMetaLoaded" );
  }
}
