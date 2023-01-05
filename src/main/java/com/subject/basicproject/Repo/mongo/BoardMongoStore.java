package com.subject.basicproject.Repo.mongo;


import com.subject.basicproject.Entity.Board;
import com.subject.basicproject.Repo.boardStore;
import com.subject.basicproject.Repo.mongo.Doc.BoardDoc;
import com.subject.basicproject.Repo.mongo.repository.BoardRepo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardMongoStore implements boardStore {


    private final BoardRepo repo;

    public BoardMongoStore(BoardRepo repo) {
        this.repo = repo;
    }

    @Override
    public void create(Board board) {
        BoardDoc boardDoc = new BoardDoc(board);
        repo.save(boardDoc);
    }

    @Override
    public void createAll(List<Board> boards) {

    }

    @Override
    public void update(Board board) {
        BoardDoc boardDoc = new BoardDoc(board);
        repo.save(boardDoc);

    }

    @Override
    public void delete(Board board) {

    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void deleteAll(List<String> ids) {

    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public Board retrieveById(Long id) {
        return repo.findById(id).get().toEntity();
    }

    @Override
    public List<Board> retrieveAll() {
        return BoardDoc.toEntities(repo.findAll());
    }
}
