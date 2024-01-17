package com.therigy.apache.hop.extensionpoints.script.pipeline;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelineBeforeSaveScript",
  extensionPointId = "PipelineBeforeSave",
  description = "Executes script(s) when pipelines are saved"
)
public class PipelineBeforeSaveExecutor extends BaseExtensionPointExecutor {

  public PipelineBeforeSaveExecutor() {
    super( "PipelineBeforeSave" );
  }
}
