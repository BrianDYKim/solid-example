package team.me.messaging

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExternalMessagingApplication

fun main(args: Array<String>) {
    runApplication<ExternalMessagingApplication>(*args)
}
