package com.therigy.apache.hop.extensionpoints.script.pipeline.transform;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "TransformFinishedScript",
  extensionPointId = "TransformFinished",
  description = "Executes script(s) after a transform is finished"
)
public class TransformFinishedExecutor extends BaseExtensionPointExecutor {

  public TransformFinishedExecutor() {
    super( "TransformFinished" );
  }
}
