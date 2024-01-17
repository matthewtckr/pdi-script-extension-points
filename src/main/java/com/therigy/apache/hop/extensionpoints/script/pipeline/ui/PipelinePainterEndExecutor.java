package com.therigy.apache.hop.extensionpoints.script.pipeline.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelinePainterEndScript",
  extensionPointId = "PipelinePainterEnd",
  description = "Executes script(s) when a pipeline is done being painted"
)
public class PipelinePainterEndExecutor extends BaseExtensionPointExecutor {

  public PipelinePainterEndExecutor() {
    super( "PipelinePainterEnd" );
  }
}
