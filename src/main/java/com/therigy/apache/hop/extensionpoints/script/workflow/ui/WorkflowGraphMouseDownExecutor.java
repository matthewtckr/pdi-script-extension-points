package com.therigy.apache.hop.extensionpoints.script.workflow.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowGraphMouseDownScript",
  extensionPointId = "WorkflowGraphMouseDown",
  description = "Executes script(s) when a mouse button is depressed on a workflow canvas"
)
public class WorkflowGraphMouseDownExecutor extends BaseExtensionPointExecutor {

  public WorkflowGraphMouseDownExecutor() {
    super( "WorkflowGraphMouseDown" );
  }
}
