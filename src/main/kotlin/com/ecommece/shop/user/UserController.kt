package com.ecommece.shop.user

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @GetMapping("/")
    fun index(): String {
        return "Hello Word"
    }
}
