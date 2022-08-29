package sirius.tinkoff.koshelok

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JMM

fun main(args: Array<String>) {
    runApplication<JMM>(*args)
}
