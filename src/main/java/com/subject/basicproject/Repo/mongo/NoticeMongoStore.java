package com.subject.basicproject.Repo.mongo;


import com.subject.basicproject.Entity.Notice;
import com.subject.basicproject.Repo.mongo.Doc.NoticeDoc;
import com.subject.basicproject.Repo.noticeStore;
import com.subject.basicproject.Repo.mongo.repository.NoticeRepo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoticeMongoStore implements noticeStore {


    private final NoticeRepo repo;

    public NoticeMongoStore(NoticeRepo repo) {
        this.repo = repo;
    }



    @Override
    public void create(Notice notice) {
        NoticeDoc noticeDoc = new NoticeDoc(notice);
        repo.save(noticeDoc);
    }

    @Override
    public void createAll(List<Notice> notices) {

    }

    @Override
    public void update(Notice notice) {
        NoticeDoc noticeDoc = new NoticeDoc(notice);
        repo.save(noticeDoc);

    }

    @Override
    public void delete(Notice notice) {

    }

    @Override
    public void delete(String id) {
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
    public Notice retrieveById(String id) {
        return repo.findById(id).get().toEntity();
    }

    @Override
    public List<Notice> retrieveAll() {
        return NoticeDoc.toEntities(repo.findAll());
    }
}
