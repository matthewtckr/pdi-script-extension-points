System.out.println( 'Loading user.properties file' )
userProps = org.pentaho.di.core.util.EnvUtil.readProperties("user.properties")
org.pentaho.di.core.util.EnvUtil.applyKettleProperties(userProps, true)
System.out.println( 'Loaded user.properties file' )