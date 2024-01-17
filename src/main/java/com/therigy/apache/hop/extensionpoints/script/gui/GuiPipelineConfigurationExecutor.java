package com.therigy.apache.hop.extensionpoints.script.gui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "GuiPipelineExecutionConfigurationScript",
  extensionPointId = "GuiPipelineExecutionConfiguration",
  description = "Executes script(s) when Gui configures a pipeline execution"
)
public class GuiPipelineConfigurationExecutor extends BaseExtensionPointExecutor {

  public GuiPipelineConfigurationExecutor() {
    super( "GuiPipelineExecutionConfiguration" );
  }
}
