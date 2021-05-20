package com.example.quizztest.service.question;

import com.example.quizztest.model.Level;
import com.example.quizztest.model.Question;

public interface IQuestionService {
    Question addQuestion(Question question, Level level);
}
