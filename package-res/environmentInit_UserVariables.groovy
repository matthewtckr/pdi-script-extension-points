System.out.println( 'Loading user.properties file' )
import org.pentaho.di.core.util.EnvUtil
try {
  userProps = EnvUtil.readProperties("user.properties")
  EnvUtil.applyKettleProperties(userProps, true)
  System.out.println( 'Loaded user.properties file' )
} catch (Exception ex) {
  System.out.println( 'Failed to load user.properties file' )
}
