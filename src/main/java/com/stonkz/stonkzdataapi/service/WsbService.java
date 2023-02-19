package com.stonkz.stonkzdataapi.service;

import com.stonkz.stonkzdataapi.client.WsbClient;
import com.stonkz.stonkzdataapi.model.wsb.WsbResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WsbService {

    @Autowired
    WsbClient client;

    public List<WsbResponse> callWsbData(String date) {
        return client.retrieveData(date);
    }
}