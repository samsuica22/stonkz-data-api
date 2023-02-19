package com.stonkz.stonkzdataapi.service;

import com.stonkz.stonkzdataapi.client.AlphaAdvantageClient;
import com.stonkz.stonkzdataapi.model.alpha_advantage.AlphaAdvantageNewsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AlphaAdvantageService {

    private final AlphaAdvantageClient alphaAdvantageClient;

    public AlphaAdvantageNewsResponse retrieveNews(){
        return alphaAdvantageClient.retrieveNews();
    }
}
