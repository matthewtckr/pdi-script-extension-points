package com.therigy.apache.hop.extensionpoints.script.workflow;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowBeforeSaveScript",
  extensionPointId = "WorkflowBeforeSave",
  description = "Executes script(s) when a workflow is saved"
)
public class WorkflowBeforeSaveExecutor extends BaseExtensionPointExecutor {

  public WorkflowBeforeSaveExecutor() {
    super( "WorkflowBeforeSave" );
  }
}
