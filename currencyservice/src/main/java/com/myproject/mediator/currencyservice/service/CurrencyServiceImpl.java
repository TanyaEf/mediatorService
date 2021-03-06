package com.myproject.mediator.currencyservice.service;

import com.myproject.mediator.model.ExchangeRate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyServiceImpl implements CurrencyService {
    private RestTemplate restTemplate;

    public CurrencyServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public ExchangeRate[] getExchanges() {
        ExchangeRate[] ratesArray = restTemplate.getForObject("https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=11", ExchangeRate[].class);

        return ratesArray;
    }
}
