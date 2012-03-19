import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.Queue
import static org.springframework.amqp.core.Binding.DestinationType.QUEUE

// Place your Spring DSL code here
beans = {
//    "grails.rabbit.queue.messageStore"(Queue, "messageStore", false, true, true, null)

//    "grails.rabbit.binding.direct.messageStore"(Binding,
//            "messageStore", QUEUE, "amq.direct", "sample.logs", null)

    springConfig.addAlias('transactionManager','mongoTransactionManager')
}
