package com.therigy.apache.hop.extensionpoints.script.workflow;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowStartScript",
  extensionPointId = "WorkflowStart",
  description = "Executes script(s) when a workflow is started"
)
public class WorkflowStartExecutor extends BaseExtensionPointExecutor {

  public WorkflowStartExecutor() {
    super( "WorkflowStart" );
  }
}
