package com.therigy.apache.hop.extensionpoints.script.workflow;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowBeginProcessingScript",
  extensionPointId = "WorkflowBeginProcessing",
  description = "Executes script(s) when a workflow is started after log table handling"
)
public class WorkflowBeginProcessingExecutor extends BaseExtensionPointExecutor {

  public WorkflowBeginProcessingExecutor() {
    super( "WorkflowBeginProcessing" );
  }
}
