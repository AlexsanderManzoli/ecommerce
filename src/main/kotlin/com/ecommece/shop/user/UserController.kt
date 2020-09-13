package com.ecommece.shop.user

import com.ecommece.shop.models.Users
import com.ecommece.shop.repository.UsersRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UsersController(private val usersRepository: UsersRepository) {
    @GetMapping("/")
    fun index(): List<Users> = usersRepository.findAll();
}
