package br.com.gui

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter: AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "World") name: String?): Greeting {
        /* Na url adicione ?name= e o nome de alguém ou algo */
        return Greeting(counter.incrementAndGet(), "Hello, $name!")
    }
}