package com.therigy.apache.hop.extensionpoints.script.workflow.action;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowAfterActionExecutionScript",
  extensionPointId = "WorkflowAfterActionExecution",
  description = "Executes script(s) after a workflow action is executed"
)
public class WorkflowAfterActionExecutor extends BaseExtensionPointExecutor {

  public WorkflowAfterActionExecutor() {
    super( "WorkflowAfterActionExecution" );
  }
}
