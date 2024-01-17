package com.therigy.apache.hop.extensionpoints.script.pipeline.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelineGraphMouseDownScript",
  extensionPointId = "PipelineGraphMouseDown",
  description = "Executes script(s) when a mouse button is depressed on a pipeline canvas"
)
public class PipelineGraphMouseDownExecutor extends BaseExtensionPointExecutor {

  public PipelineGraphMouseDownExecutor() {
    super( "PipelineGraphMouseDown" );
  }
}
