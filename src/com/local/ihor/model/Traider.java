package com.local.ihor.model;

import java.math.BigDecimal;

public class Traider extends BaseModel{
    private String traiderName;
    private Integer freqTick;
    private BigDecimal cash;
    private Integer tradingMethod;
    private Integer changeProbability;
    private String about;

    public Traider(){}

    public Traider(long id, String traiderName, Integer freqTick, BigDecimal cash, Integer tradingMethod, Integer changeProbability, String about) {
        super(id);
        this.traiderName = traiderName;
        this.freqTick = freqTick;
        this.cash = cash;
        this.tradingMethod = tradingMethod;
        this.changeProbability = changeProbability;
        this.about = about;
    }

    public String getTraiderName() {
        return traiderName;
    }

    public void setTraiderName(String traiderName) {
        this.traiderName = traiderName;
    }

    public Integer getFreqTick() {
        return freqTick;
    }

    public void setFreqTick(Integer freqTick) {
        this.freqTick = freqTick;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public Integer getTradingMethod() {
        return tradingMethod;
    }

    public void setTradingMethod(Integer tradingMethod) {
        this.tradingMethod = tradingMethod;
    }

    public Integer getChangeProbability() {
        return changeProbability;
    }

    public void setChangeProbability(Integer changeProbability) {
        this.changeProbability = changeProbability;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
