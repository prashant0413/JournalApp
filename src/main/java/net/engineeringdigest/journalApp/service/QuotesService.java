package net.engineeringdigest.journalApp.service;

import org.springframework.beans.factory.annotation.Value;

public class QuotesService {

    @Value("${quotes.api.key}")
    private String apiKey;
}
