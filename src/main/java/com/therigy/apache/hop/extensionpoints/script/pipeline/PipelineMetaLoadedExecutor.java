package com.therigy.apache.hop.extensionpoints.script.pipeline;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelineMetaLoadedScript",
  extensionPointId = "PipelineMetaLoaded",
  description = "Executes script(s) when pipeline metadata is loaded"
)
public class PipelineMetaLoadedExecutor extends BaseExtensionPointExecutor {

  public PipelineMetaLoadedExecutor() {
    super( "PipelineMetaLoaded" );
  }
}
