package com.brs.daily_quote;

import org.springframework.stereotype.Service;

@Service
public class DailyQuoteService {
    private final DailyquoteRespositry repository;

    public DailyQuoteService(DailyquoteRespositry repository) {
        this.repository = repository;
    }

    public String getQuote() {
        var quotes = repository.getQuotes();
        int randomIndex = (int) (Math.floor(Math.random() * quotes.length));
        return quotes[randomIndex];
    }

}
