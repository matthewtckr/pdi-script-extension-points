package com.therigy.apache.hop.extensionpoints.script.pipeline;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelineStartScript",
  extensionPointId = "PipelineStart",
  description = "Executes script(s) when pipelines are started"
)
public class PipelineStartExecutor extends BaseExtensionPointExecutor {

  public PipelineStartExecutor() {
    super( "PipelineStart" );
  }
}
