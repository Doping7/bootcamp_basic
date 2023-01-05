package com.subject.basicproject.Service;

import com.subject.basicproject.Entity.Board;
import com.subject.basicproject.Repo.mongo.BoardMongoStore;
import com.subject.basicproject.Util.IdUtil;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BoardService {

    private final BoardMongoStore store;

    public BoardService(BoardMongoStore store) {
        this.store = store;
    }


    public List<Board> getBoardList(){
        return store.retrieveAll();
    }

    public void regBoard(Board board) {
        board.setId(IdUtil.genId());
        board.setCreateDate(new Date().toString());
        board.setModDate(new Date().toString());
        board.setViewCount(0);
        store.create(board);
    }

    public void modBoard(Board board) {
        store.update(board);
    }

    public void deleteBoard(Long id) {
        store.delete(id);
    }

    public Board getBoard(Long id) {
        return store.retrieveById(id);
    }
}
