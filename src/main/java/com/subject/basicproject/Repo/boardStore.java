package com.subject.basicproject.Repo;

import com.subject.basicproject.Entity.Board;

import java.util.List;

public interface boardStore {

    void create(Board board);
    void createAll(List<Board> boards);
    void update(Board board);
    void delete(Board board);
    void delete(Long id);
    void deleteAll(List<String> ids);
    boolean exists(Long id);
    Board retrieveById(Long id);

    List<Board> retrieveAll();


}
