package com.freetable.freetable.controller;

import com.freetable.freetable.model.Board;
import com.freetable.freetable.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/boards")
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Board> getAllBoards(){
        return boardService.getAllBoards();
    }
}
