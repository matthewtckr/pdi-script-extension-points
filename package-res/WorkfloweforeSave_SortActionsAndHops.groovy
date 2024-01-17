def countEntries = _object_.nrJobEntries()
def entries = new ArrayList<org.pentaho.di.job.entry.JobEntryCopy>()
def hops = new ArrayList<org.pentaho.di.job.JobHopMeta>()

countEntries.times {
  entries.add(_object_.getJobEntry( it ))
}
entries.sort{a,b -> a.getName() <=> b.getName()}
countEntries.times {
  _object_.removeJobEntry( 0 )
}
countEntries.times {
  _object_.addJobEntry(entries.get( it ))
}

def countHops = _object_.nrJobHops()
countHops.times {
  hops.add(_object_.getJobHop( it ))
}
hops.sort{a,b -> a.getXML() <=> b.getXML()}
countHops.times {
  _object_.removeJobHop( 0 )
}
countHops.times {
  _object_.addJobHop(hops.get( it ))
}
_log_.logBasic "${_object_.name} sorted..."