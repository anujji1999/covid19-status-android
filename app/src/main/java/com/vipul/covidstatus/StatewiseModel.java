package com.vipul.covidstatus;

public class StatewiseModel {
    private String state;
    private String confirmed;
    private String active;
    private String deceased;
    private String recovered;
    private String newConfirmed;
    private String newRecovered;
    private String newDeceased;
    private String lastupdate;

    public StatewiseModel(String state, String confirmed, String active, String deceased, String recovered, String newConfirmed, String newRecovered, String newDeceased, String lastupdate) {
        this.state = state;
        this.confirmed = confirmed;
        this.active = active;
        this.deceased = deceased;
        this.recovered = recovered;
        this.newConfirmed = newConfirmed;
        this.newRecovered = newRecovered;
        this.newDeceased = newDeceased;
        this.lastupdate = lastupdate;
    }

    public String getState() {
        return state;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public String getActive() {
        return active;
    }

    public String getDeceased() {
        return deceased;
    }

    public String getRecovered() {
        return recovered;
    }

    public String getNewConfirmed() {
        return newConfirmed;
    }

    public String getNewRecovered() {
        return newRecovered;
    }

    public String getNewDeceased() {
        return newDeceased;
    }

    public String getLastupdate() {
        return lastupdate;
    }
}