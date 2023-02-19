package com.stonkz.stonkzdataapi.client;

import com.stonkz.stonkzdataapi.config.AlphaAdvantageConfig;
import com.stonkz.stonkzdataapi.model.alpha_advantage.AlphaAdvantageNewsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


@RequiredArgsConstructor
@Component
public class AlphaAdvantageClient {

    private final AlphaAdvantageConfig config;

    public AlphaAdvantageNewsResponse retrieveNews(){
        WebClient client = WebClient.create("https://www.alphavantage.co/query");

        return client.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/query")
                        .queryParam("function","NEWS_SENTIMENT")
                        .queryParam("apikey", config.getKey())
                        .build())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(AlphaAdvantageNewsResponse.class)
                .block();
    }




}
