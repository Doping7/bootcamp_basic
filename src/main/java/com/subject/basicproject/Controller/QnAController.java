package com.subject.basicproject.Controller;

import com.subject.basicproject.Entity.QnA;
import com.subject.basicproject.Service.QnAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/qna")
public class QnAController {
    @Autowired
    public QnAService service;

    @PostMapping("/getQnAList")
    public List<QnA> getQnAList() {
        return service.getQnAList();
    }

    @PostMapping("/getQnA")
    public QnA getQnA(Long id) { return service.getQnA(id); }

    @PostMapping("/regQnA")
    public void regQnA(@RequestBody QnA qna){
        service.regQnA(qna);
    }

    @PostMapping("/modQnA")
    public void modQnA(QnA qna) { service.modQnA(qna); }

    @PostMapping("/delQnA")
    public void deleteQnA(Long id) {service.deleteQnA(id); }
}
