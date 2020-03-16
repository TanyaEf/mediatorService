package com.myproject.mediator.currencyservice.web.controllers;

import com.myproject.mediator.currencyservice.service.CurrencyService;
import com.myproject.mediator.model.ExchangeRate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    private CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @RequestMapping("/")
    public ResponseEntity<ExchangeRate[]> index() {
        return new ResponseEntity<>(currencyService.getExchanges(), HttpStatus.OK);
    }
}
