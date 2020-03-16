package com.myproject.mediator.model;

import java.math.BigDecimal;

public class ExchangeRate {
    private CurrencyEnum ccy;
    private CurrencyEnum base_ccy;
    private BigDecimal buy;
    private BigDecimal sale;

    public ExchangeRate() {
    }

    public CurrencyEnum getCcy() {
        return ccy;
    }

    public void setCcy(CurrencyEnum ccy) {
        this.ccy = ccy;
    }

    public CurrencyEnum getBase_ccy() {
        return base_ccy;
    }

    public void setBase_ccy(CurrencyEnum base_ccy) {
        this.base_ccy = base_ccy;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public void setBuy(BigDecimal buy) {
        this.buy = buy;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }
}
