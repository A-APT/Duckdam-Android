package com.aligatorapt.duckdam.dto.user

data class RegisterDto (
    val name: String,
    val password: String,
    val email: String,
    val profile: String?
)