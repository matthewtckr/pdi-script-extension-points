package com.therigy.apache.hop.extensionpoints.script.pipeline;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelineFinishScript",
  extensionPointId = "PipelineFinish",
  description = "Executes script(s) when pipelines are finished"
)
public class PipelineFinishExecutor extends BaseExtensionPointExecutor {

  public PipelineFinishExecutor() {
    super( "PipelineFinish" );
  }
}
