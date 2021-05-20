package com.example.quizztest.service.history;

import com.example.quizztest.model.History;
import com.example.quizztest.repository.IHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HistoryService implements IHistoryService {
    @Autowired
    IHistoryRepository historyRepository;

    @Override
    public History addHistory(History history) {
        return historyRepository.save(history);
    }

    @Override
    public History editHistory(History history, History history1) {
        history.setUsername(history1.getUsername());
        history.setLevelName(history1.getLevelName());
        history.setThemeName(history1.getThemeName());
        history.setSore(history1.getSore());
        history.setTotal(history1.getTotal());
        return historyRepository.save(history);
    }
}
