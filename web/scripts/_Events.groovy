// Override to workaround GRAILS-7296
org.codehaus.groovy.grails.test.support.GrailsTestTypeSupport.metaClass.getSourceDir = { ->
    new File(delegate.buildBinding.grailsSettings.testSourceDir, delegate.relativeSourcePath)
}
