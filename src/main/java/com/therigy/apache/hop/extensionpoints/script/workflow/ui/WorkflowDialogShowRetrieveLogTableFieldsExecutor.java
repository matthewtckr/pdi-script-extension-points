package com.therigy.apache.hop.extensionpoints.script.workflow.ui;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowDialogShowRetrieveLogTableFieldsScript",
  extensionPointId = "WorkflowDialogShowRetrieveLogTableFields",
  description = "Executes script(s) when retrieving the contents of the log channel fields on its composite"
)
public class WorkflowDialogShowRetrieveLogTableFieldsExecutor extends BaseExtensionPointExecutor {

  public WorkflowDialogShowRetrieveLogTableFieldsExecutor() {
    super( "WorkflowDialogShowRetrieveLogTableFields" );
  }
}
