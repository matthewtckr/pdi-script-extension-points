package com.therigy.apache.hop.extensionpoints.script.pipeline.transform;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "TransformBeforeStartScript",
  extensionPointId = "TransformBeforeStart",
  description = "Executes script(s) before a transform is started"
)
public class TransformBeforeStartExecutor extends BaseExtensionPointExecutor {

  public TransformBeforeStartExecutor() {
    super( "TransformBeforeStart" );
  }
}
