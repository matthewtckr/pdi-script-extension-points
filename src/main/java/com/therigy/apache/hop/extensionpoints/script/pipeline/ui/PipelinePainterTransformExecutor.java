package com.therigy.apache.hop.extensionpoints.script.pipeline.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelinePainterTransformScript",
  extensionPointId = "PipelinePainterTransform",
  description = "Executes script(s) when a transform is being painted"
)
public class PipelinePainterTransformExecutor extends BaseExtensionPointExecutor {

  public PipelinePainterTransformExecutor() {
    super( "PipelinePainterTransform" );
  }
}
