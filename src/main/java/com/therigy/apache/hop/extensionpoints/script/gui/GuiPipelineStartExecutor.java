package com.therigy.apache.hop.extensionpoints.script.gui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "GuiPipelineMetaExecutionStartScript",
  extensionPointId = "GuiPipelineMetaExecutionStart",
  description = "Executes script(s) when Gui starts a pipeline"
)
public class GuiPipelineStartExecutor extends BaseExtensionPointExecutor {

  public GuiPipelineStartExecutor() {
    super( "GuiPipelineMetaExecutionStart" );
  }
}
