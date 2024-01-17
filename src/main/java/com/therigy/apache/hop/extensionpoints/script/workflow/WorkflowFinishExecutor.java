package com.therigy.apache.hop.extensionpoints.script.workflow;

import org.apache.hop.core.extension.ExtensionPoint;

import com.therigy.apache.hop.extensionpoints.script.BaseExtensionPointExecutor;

@ExtensionPoint(
  id = "WorkflowFinishScript",
  extensionPointId = "WorkflowFinish",
  description = "Executes script(s) when a workflow is started"
)
public class WorkflowFinishExecutor extends BaseExtensionPointExecutor {

  public WorkflowFinishExecutor() {
    super( "WorkflowFinish" );
  }
}
