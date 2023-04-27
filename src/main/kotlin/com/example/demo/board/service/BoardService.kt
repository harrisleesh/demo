package com.example.demo.board.service

import com.example.demo.board.controller.dto.BoardListResponse
import com.example.demo.board.controller.dto.BoardRequest
import com.example.demo.board.controller.dto.toEntity
import com.example.demo.board.controller.dto.toResponse
import com.example.demo.board.entity.BoardRepository
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardRepository: BoardRepository,
) {
    fun getBoards(): BoardListResponse = boardRepository.findAll().toResponse()
    fun createBoard(boardRequest: BoardRequest) = boardRepository.save(boardRequest.toEntity()).id


}

