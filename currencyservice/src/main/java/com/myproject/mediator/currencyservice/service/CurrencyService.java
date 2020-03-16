package com.myproject.mediator.currencyservice.service;

import com.myproject.mediator.model.ExchangeRate;

public interface CurrencyService {
    ExchangeRate[] getExchanges();
}
