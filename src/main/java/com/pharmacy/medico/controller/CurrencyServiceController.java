package com.pharmacy.medico.controller;

import com.pharmacy.medico.CurrencyServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {
    @Autowired
    CurrencyServiceConfig config;

    @GetMapping("/currency")
    public CurrencyServiceConfig getConfig()  {
        return config;
    }
}
