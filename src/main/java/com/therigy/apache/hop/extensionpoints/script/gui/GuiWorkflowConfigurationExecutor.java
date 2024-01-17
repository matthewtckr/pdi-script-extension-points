package com.therigy.apache.hop.extensionpoints.script.gui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "GuiWorkflowExecutionConfigurationScript",
  extensionPointId = "GuiWorkflowExecutionConfiguration",
  description = "Executes script(s) when Gui configures a workflow execution"
)
public class GuiWorkflowConfigurationExecutor extends BaseExtensionPointExecutor {

  public GuiWorkflowConfigurationExecutor() {
    super( "GuiWorkflowExecutionConfiguration" );
  }
}
