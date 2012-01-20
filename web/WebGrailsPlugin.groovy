import org.codehaus.groovy.grails.commons.ConfigurationHolder

class WebGrailsPlugin {
	def grailsApplication
	def version = "1.0.0"
	def grailsVersion = "1.3.6 > *"
	def dependsOn = [:]
	def pluginExcludes = [
		'web-app/*'
		]
	
	def author = "Gabriel Szlechtman"
	def authorEmail = "gabrielsz@gmail.com"
	def title = "JsonP filter"
	def description = ''

	def doWithWebDescriptor = { xml ->
		def filters = xml.'filter'
		filters[-1] + {
			'filter' {
				'filter-name'('jsonpfilter')
				'filter-class'('com.ml.filters.JsonpFilter')
			}
		}
		def filterMappings = xml.'filter'
		filterMappings[-1] + {
			'filter-mapping' {
				'filter-name'('jsonpfilter')
				'url-pattern'('/*')
			}
		}
	}
	
	def doWithSpring = { applicationContext -> }
	
	def doWithDynamicMethods = { ctx -> }

	def doWithApplicationContext = { applicationContext -> }

	def onChange = { event -> }

	def onConfigChange = { event -> }
}
