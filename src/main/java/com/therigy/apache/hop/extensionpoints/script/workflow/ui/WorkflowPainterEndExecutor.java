package com.therigy.apache.hop.extensionpoints.script.workflow.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowPainterEndScript",
  extensionPointId = "WorkflowPainterEnd",
  description = "Executes script(s) when a workflow is done being painted"
)
public class WorkflowPainterEndExecutor extends BaseExtensionPointExecutor {

  public WorkflowPainterEndExecutor() {
    super( "WorkflowPainterEnd" );
  }
}
