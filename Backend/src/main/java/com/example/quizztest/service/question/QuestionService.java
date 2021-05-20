package com.example.quizztest.service.question;

import com.example.quizztest.model.Level;
import com.example.quizztest.model.Question;
import com.example.quizztest.repository.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class QuestionService implements IQuestionService{
    @Autowired
    private IQuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question, Level level) {
        level.addQuestion(question);
        return questionRepository.save(question);
    }
}
