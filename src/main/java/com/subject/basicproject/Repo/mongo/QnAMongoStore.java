package com.subject.basicproject.Repo.mongo;


import com.subject.basicproject.Entity.QnA;
import com.subject.basicproject.Repo.mongo.Doc.QnADoc;
import com.subject.basicproject.Repo.mongo.repository.QnARepo;
import com.subject.basicproject.Repo.qnaStore;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QnAMongoStore implements qnaStore {


    private final QnARepo repo;

    public QnAMongoStore(QnARepo repo) {
        this.repo = repo;
    }

    @Override
    public void create(QnA qna) {
        QnADoc qnaDoc = new QnADoc(qna);
        repo.save(qnaDoc);
    }

    @Override
    public void createAll(List<QnA> qnas) {

    }

    @Override
    public void update(QnA qna) {
        QnADoc qnaDoc = new QnADoc(qna);
        repo.save(qnaDoc);

    }

    @Override
    public void delete(QnA qna) {

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
    public QnA retrieveById(Long id) {
        return repo.findById(id).get().toEntity();
    }

    @Override
    public List<QnA> retrieveAll() {
        return QnADoc.toEntities(repo.findAll());
    }
}
