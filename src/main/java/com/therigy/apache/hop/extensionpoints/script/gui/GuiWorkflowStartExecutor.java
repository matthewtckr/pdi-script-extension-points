package com.therigy.apache.hop.extensionpoints.script.gui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "GuiWorkflowMetaExecutionStartScript",
  extensionPointId = "GuiWorkflowMetaExecutionStart",
  description = "Executes script(s) when Gui starts a workflow"
)
public class GuiWorkflowStartExecutor extends BaseExtensionPointExecutor {

  public GuiWorkflowStartExecutor() {
    super( "GuiWorkflowMetaExecutionStart" );
  }
}
