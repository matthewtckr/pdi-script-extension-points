package com.therigy.apache.hop.extensionpoints.script.pipeline.transform;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "TransformAfterInitializeScript",
  extensionPointId = "TransformAfterInitialize",
  description = "Executes script(s) after a transform is initialized"
)
public class TransformAfterInitExecutor extends BaseExtensionPointExecutor {

  public TransformAfterInitExecutor() {
    super( "TransformAfterInitialize" );
  }
}
