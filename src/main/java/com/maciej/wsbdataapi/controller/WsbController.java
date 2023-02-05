package com.maciej.wsbdataapi.controller;

import com.maciej.wsbdataapi.model.WsbResponse;
import com.maciej.wsbdataapi.service.WsbService;
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
