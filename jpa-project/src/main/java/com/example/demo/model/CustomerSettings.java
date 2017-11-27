package com.example.demo.model;

public class CustomerSettings {

    //FK
    private Customer customer;
    private String language;
    private String dateFormat;
    private String timeFormat;
    private String timeZone;
    private String measuringFormat;
    private String tempFractionSize;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getMeasuringFormat() {
        return measuringFormat;
    }

    public void setMeasuringFormat(String measuringFormat) {
        this.measuringFormat = measuringFormat;
    }

    public String getTempFractionSize() {
        return tempFractionSize;
    }

    public void setTempFractionSize(String tempFractionSize) {
        this.tempFractionSize = tempFractionSize;
    }
}
