package com.freetable.freetable.service;

import com.freetable.freetable.model.Board;
import com.freetable.freetable.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> getAllBoards(){
        return boardRepository.findAll();
    }

    public Board findById(Long id){
        return boardRepository.getBoardById(id);
    }

    public void addBoard(Board board){
        boardRepository.save(board);
    }

    public void updateBoard(Board board){
        boardRepository.save(board);
    }

    public void deleteBoardById(Long id){
        boardRepository.deleteById(id);
    }
}
