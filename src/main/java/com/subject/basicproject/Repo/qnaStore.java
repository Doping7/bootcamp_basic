package com.subject.basicproject.Repo;

import com.subject.basicproject.Entity.QnA;

import java.util.List;

public interface qnaStore {

    void create(QnA qna);
    void createAll(List<QnA> qnas);
    void update(QnA qna);
    void delete(QnA qna);
    void delete(Long id);
    void deleteAll(List<String> ids);
    boolean exists(Long id);
    QnA retrieveById(Long id);

    List<QnA> retrieveAll();


}
