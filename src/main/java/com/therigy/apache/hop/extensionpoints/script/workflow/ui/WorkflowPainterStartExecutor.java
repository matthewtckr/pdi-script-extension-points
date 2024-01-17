package com.therigy.apache.hop.extensionpoints.script.workflow.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowPainterStartScript",
  extensionPointId = "WorkflowPainterStart",
  description = "Executes script(s) when a workflow is being painted"
)
public class WorkflowPainterStartExecutor extends BaseExtensionPointExecutor {

  public WorkflowPainterStartExecutor() {
    super( "WorkflowPainterStart" );
  }
}
