grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6

grails.project.dependency.resolution = {
    inherits "global"
    log "error"
    checksums true

    repositories {
        inherits true
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
        mavenLocal()
    }
    dependencies {

    }

    plugins {
        compile ":standalone:1.0"
        runtime ":mongodb:1.0.0.RC4", ":rabbitmq:0.4-SNAPSHOT", ":cloud-foundry:1.2.1"

        build ":tomcat:$grailsVersion"
    }
}
