package com.stonkz.stonkzdataapi.controller;

import com.stonkz.stonkzdataapi.model.wsb.WsbResponse;
import com.stonkz.stonkzdataapi.service.WsbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class WsbController {
    @Autowired
    WsbService wsbService;

    @GetMapping("/wsbData")
    public List<WsbResponse> callWsbData(@RequestParam String date){
        return wsbService.callWsbData(date);
    }
}
