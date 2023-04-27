package com.example.demo.board.controller.dto

import com.example.demo.board.entity.Board

data class BoardRequest(
    val title: String,
    val content: String,
)


fun BoardRequest.toEntity() = Board(
    title = title,
    content = content,
)
