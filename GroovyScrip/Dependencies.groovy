@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7' )

def http = new groovyx.net.http.HTTPBuilder('http://www.codehaus.org')

println(http.ToString())
