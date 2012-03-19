package org.example

import org.springframework.amqp.core.Message

class MessageStoreService {
    static transactional = false

    static rabbitSubscribe = [
            name: "amq.topic",
            routingKey: "logs.#",
            messageConverterBean: ""]

    void handleMessage(Message msg) {
        def props = msg.messageProperties
        def logMessage = new LogMessage(
                message: new String(msg.body, props.contentEncoding ?: "UTF-8"),
                appName: props.receivedRoutingKey - "logs.",
                category: props.headers.categoryName,
                level: props.headers.level).save(flush: true)
    }
}
