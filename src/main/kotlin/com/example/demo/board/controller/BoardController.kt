package com.example.demo.board.controller

import com.example.demo.board.controller.dto.BoardListResponse
import com.example.demo.board.controller.dto.BoardRequest
import com.example.demo.board.service.BoardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardController(
    private val boardService: BoardService,
) {

    @GetMapping("/board")
    fun getBoardList(): BoardListResponse {
        return boardService.getBoards()
    }

    @PostMapping("/board")
    fun createBoard(
        @RequestBody
        boardRequest: BoardRequest
    ): Long {
        print("title: $boardRequest.title, content: $boardRequest.content")
        return boardService.createBoard(boardRequest)
    }
}
