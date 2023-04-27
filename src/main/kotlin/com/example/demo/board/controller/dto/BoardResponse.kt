package com.example.demo.board.controller.dto

import com.example.demo.board.entity.Board

data class BoardResponse(
    val id: Long,
    val title: String,
    val content: String,
)

data class BoardListResponse(
    val boards: List<BoardResponse>,
)

fun List<Board>.toResponse() = BoardListResponse(
    boards = this.map { it.toResponse() }
)

fun Board.toResponse() = BoardResponse(
    id = id,
    title = title,
    content = content,
)
