package com.example.demo.board.entity

import org.springframework.stereotype.Component

//import org.springframework.data.jpa.repository.JpaRepository

@Component
class BoardRepository {
    fun findAll() = listOf(Board("title", "content"))
    fun save(toEntity: Board): Board {
        return Board("title", "content")
    }

}
