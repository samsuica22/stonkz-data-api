package com.stonkz.stonkzdataapi.model.alpha_advantage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedItem {
    private String title;
    private String url;
    private String time_published;
    private String summary;
    private String banner_image;
    private String source;
    private String source_domain;
    private List<Topic> topics;
    private Integer overall_sentiment_score;
    private String overall_sentiment_label;
    private List<TickerSentiment> ticker_sentiment;
}
