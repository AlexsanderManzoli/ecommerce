package com.ecommece.shop.models

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*;
import javax.validation.constraints.NotBlank

@Entity
data class Users (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @get: NotBlank
        val email: String = "",

        @get: NotBlank
        val name: String = "",

        @get: NotBlank
        val uid: String = ""
)
