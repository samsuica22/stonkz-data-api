package com.stonkz.stonkzdataapi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(value = "alpha-advantage-api")
public class AlphaAdvantageConfig {
    private String key;
}
