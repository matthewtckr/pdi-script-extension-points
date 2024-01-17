package com.therigy.apache.hop.extensionpoints.script.pipeline.transform;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "TransformBeforeInitializeScript",
  extensionPointId = "TransformBeforeInitialize",
  description = "Executes script(s) before a transform is initialized"
)
public class TransformBeforeInitExecutor extends BaseExtensionPointExecutor {

  public TransformBeforeInitExecutor() {
    super( "TransformBeforeInitialize" );
  }
}
