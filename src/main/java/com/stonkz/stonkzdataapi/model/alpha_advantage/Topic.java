package com.stonkz.stonkzdataapi.model.alpha_advantage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Topic {
    private String topic;
    private String relevance_score;
}
