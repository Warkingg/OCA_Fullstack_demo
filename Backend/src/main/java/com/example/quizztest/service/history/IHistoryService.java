package com.example.quizztest.service.history;

import com.example.quizztest.model.History;

public interface IHistoryService {
    History addHistory(History history);

    History editHistory(History history, History history1);
}
