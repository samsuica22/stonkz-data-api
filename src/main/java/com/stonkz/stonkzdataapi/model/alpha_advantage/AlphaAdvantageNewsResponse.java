package com.stonkz.stonkzdataapi.model.alpha_advantage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlphaAdvantageNewsResponse {
    private String items;
    private String sentiment_score_definition;
    private String relevance_score_definition;
    private List<FeedItem> feed;
}
