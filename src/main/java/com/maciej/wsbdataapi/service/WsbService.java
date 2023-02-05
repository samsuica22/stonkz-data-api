package com.maciej.wsbdataapi.service;

import com.maciej.wsbdataapi.client.WsbClient;
import com.maciej.wsbdataapi.model.WsbResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WsbService {

    @Autowired
    WsbClient client;

    public List<WsbResponse> callWsbData(String date) {
        return client.retrieveData(date);
    }
}