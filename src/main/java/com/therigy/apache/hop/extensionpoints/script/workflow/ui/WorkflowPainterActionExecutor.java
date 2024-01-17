package com.therigy.apache.hop.extensionpoints.script.workflow.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowPainterActionScript",
  extensionPointId = "WorkflowPainterAction",
  description = "Executes script(s) when a workflow action is being painted"
)
public class WorkflowPainterActionExecutor extends BaseExtensionPointExecutor {

  public WorkflowPainterActionExecutor() {
    super( "WorkflowPainterAction" );
  }
}
