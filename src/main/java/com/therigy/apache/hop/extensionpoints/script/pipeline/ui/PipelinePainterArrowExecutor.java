package com.therigy.apache.hop.extensionpoints.script.pipeline.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelinePainterArrowScript",
  extensionPointId = "PipelinePainterArrow",
  description = "Executes script(s) when a hop arrow is being painted"
)
public class PipelinePainterArrowExecutor extends BaseExtensionPointExecutor {

  public PipelinePainterArrowExecutor() {
    super( "PipelinePainterArrow" );
  }
}
