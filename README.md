Cloud Foundry log-app
=====================

This is a sample Grails application that can be deployed to Cloud Foundry. It receives log messages that have been sent by the Spring Log4j AmqpAppender and stores them in a MongoDB instance. It also provides a scaffolded UI for viewing those log messages.

Only log messages that are routed through the 'amq.topic' exchange with a routing key that matches 'logs.#' are consumed and stored. It expects the messages to include 'categoryName' and 'level' custom headers, although they aren't required.
