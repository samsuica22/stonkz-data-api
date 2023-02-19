package com.stonkz.stonkzdataapi.controller;

import com.stonkz.stonkzdataapi.model.alpha_advantage.AlphaAdvantageNewsResponse;
import com.stonkz.stonkzdataapi.service.AlphaAdvantageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RequiredArgsConstructor
@RestController
public class AlphaAdvantageController {

    private final AlphaAdvantageService alphaAdvantageService;

    @GetMapping("/news")
    public AlphaAdvantageNewsResponse retrieveNews(){
        return alphaAdvantageService.retrieveNews();
    }
}
