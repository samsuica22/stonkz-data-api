package com.stonkz.stonkzdataapi.model.alpha_advantage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TickerSentiment {
    private String ticker;
    private String relevance_score;
    private String ticker_sentiment_score;
    private String ticker_sentiment_label;
}
