package com.therigy.apache.hop.extensionpoints.script.pipeline;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelineStartThreadsScript",
  extensionPointId = "PipelineStartThreads",
  description = "Executes script(s) when pipeline transform threads are started"
)
public class PipelineStartThreadsExecutor extends BaseExtensionPointExecutor {

  public PipelineStartThreadsExecutor() {
    super( "PipelineStartThreads" );
  }
}
