package com.therigy.apache.hop.extensionpoints.script.workflow.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowGraphActionSetMenuScript",
  extensionPointId = "WorkflowGraphActionSetMenu",
  description = "Executes script(s) to manipulate the menu on right-click on a workflow action"
)
public class WorkflowGraphActionSetMenuExecutor extends BaseExtensionPointExecutor {

  public WorkflowGraphActionSetMenuExecutor() {
    super( "WorkflowGraphActionSetMenu" );
  }
}
