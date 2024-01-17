package com.therigy.apache.hop.extensionpoints.script.pipeline;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "PipelinePrepareScript",
  extensionPointId = "PipelinePrepareExecution",
  description = "Executes script(s) when pipelines are preparing for execution"
)
public class PipelinePrepareExecutor extends BaseExtensionPointExecutor {

  public PipelinePrepareExecutor() {
    super( "PipelinePrepareExecution" );
  }
}
