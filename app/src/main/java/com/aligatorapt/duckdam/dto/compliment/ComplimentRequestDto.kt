package com.aligatorapt.duckdam.dto.compliment

data class ComplimentRequestDto (
    val toId: Long,
    val stickerNum: Int,
    val message: String,
)
