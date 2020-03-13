package com.myproject.mediator.currencyservice.service;

import com.myproject.mediator.model.ExchangeRate;
import com.myproject.mediator.model.ExchangeRateList;

public interface CurrencyService {
//    Map<CurrenciesEnum, String> getExchanges();
    ExchangeRate[] getExchanges();
}
