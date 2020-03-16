package com.myproject.mediator.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum  CurrencyEnum {
    UAH,
    USD,
    EUR,
    RUR,
    BTC;

    @JsonValue
    public String toValue() {
        return this.toString();
    }

    @JsonCreator
    public CurrencyEnum toEnum(String value) {
        return CurrencyEnum.valueOf(value);
    }

}
