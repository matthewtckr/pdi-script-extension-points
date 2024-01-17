package com.therigy.apache.hop.extensionpoints.script.workflow.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowGraphMouseDoubleClickScript",
  extensionPointId = "WorkflowGraphMouseDoubleClick",
  description = "Executes script(s) when a mouse button is double-clicked on a workflow canvas"
)
public class WorkflowGraphMouseDoubleClickExecutor extends BaseExtensionPointExecutor {

  public WorkflowGraphMouseDoubleClickExecutor() {
    super( "WorkflowGraphMouseDoubleClick" );
  }
}
