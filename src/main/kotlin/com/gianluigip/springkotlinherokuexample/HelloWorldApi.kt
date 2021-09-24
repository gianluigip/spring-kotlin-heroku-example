package com.gianluigip.springkotlinherokuexample

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldApi {

    @GetMapping("/")
    fun welcome():ResponseEntity<String> {
        return ResponseEntity.ok("Welcome to Spring Kotlin Heroku Example")
    }

    @GetMapping("hello")
    fun getHello():ResponseEntity<String> {
        return ResponseEntity.ok("Hello World!")
    }
}
