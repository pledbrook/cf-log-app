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
        mavenRepo "http://maven.springframework.org/milestone/"
    }
    dependencies {

    }

    plugins {
        runtime ":mongodb:1.0.0.GA", ":rabbitmq:1.0.0.RC1", ":cloud-foundry:1.2.2"

        build ":tomcat:$grailsVersion"
    }
}
