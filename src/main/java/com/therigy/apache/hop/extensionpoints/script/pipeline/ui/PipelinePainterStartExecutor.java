package com.therigy.apache.hop.extensionpoints.script.pipeline.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelinePainterStartScript",
  extensionPointId = "PipelinePainterStart",
  description = "Executes script(s) when a pipeline is being painted"
)
public class PipelinePainterStartExecutor extends BaseExtensionPointExecutor {

  public PipelinePainterStartExecutor() {
    super( "PipelinePainterStart" );
  }
}
