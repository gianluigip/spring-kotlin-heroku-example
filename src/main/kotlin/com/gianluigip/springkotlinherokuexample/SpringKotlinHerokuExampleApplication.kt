package com.gianluigip.springkotlinherokuexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinHerokuExampleApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinHerokuExampleApplication>(*args)
}
