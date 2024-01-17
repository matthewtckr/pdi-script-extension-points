package com.therigy.apache.hop.extensionpoints.script.workflow.action;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowBeforeActionExecutionScript",
  extensionPointId = "WorkflowBeforeActionExecution",
  description = "Executes script(s) before a workflow action is executed"
)
public class WorkflowBeforeActionExecutor extends BaseExtensionPointExecutor {

  public WorkflowBeforeActionExecutor() {
    super( "WorkflowBeforeActionExecution" );
  }
}
