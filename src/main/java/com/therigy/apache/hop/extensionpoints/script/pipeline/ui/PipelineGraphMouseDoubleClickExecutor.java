package com.therigy.apache.hop.extensionpoints.script.pipeline.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelineGraphMouseDoubleClickScript",
  extensionPointId = "PipelineGraphMouseDoubleClick",
  description = "Executes script(s) when a mouse button is double-clicked on a pipeline canvas"
)
public class PipelineGraphMouseDoubleClickExecutor extends BaseExtensionPointExecutor {

  public PipelineGraphMouseDoubleClickExecutor() {
    super( "PipelineGraphMouseDoubleClick" );
  }
}
