package com.therigy.apache.hop.extensionpoints.script.workflow.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowPainterArrowScript",
  extensionPointId = "WorkflowPainterArrow",
  description = "Executes script(s) when a workflow action hop arrow is being painted"
)
public class WorkflowPainterArrowExecutor extends BaseExtensionPointExecutor {

  public WorkflowPainterArrowExecutor() {
    super( "WorkflowPainterArrow" );
  }
}
