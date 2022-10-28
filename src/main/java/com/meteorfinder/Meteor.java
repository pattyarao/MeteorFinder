package com.meteorfinder;

import java.io.IOException;

public class Meteor {
    /**
     * {"name":"Aachen",
     * "id":"1",
     * "nametype":"Valid",
     * "recclass":"L5",
     * "mass":"21",
     * "fall":"Fell",
     * "year":"1880-01-01T00:00:00.000",
     * "reclat":"50.775000",
     * "reclong":"6.083330",
     * "geolocation":{"type":"Point","coordinates":[6.08333,50.775]}}
    **/
    private String name;
    private int id;
    private String nametype;
    private String recclass;
    private double mass;
    private String fall;
    private String year;
    private double reclat;
    private double reclong;
    // private String geolocation;

    public String getName() {
        return this.name;
    }
    public int getID() {
        return this.id;
    }
    public String getNameType() {
        return this.nametype;
    }
    public String getRecclass() {
        return this.recclass;
    }
    public double getMass() {
        return this.mass;
    }
    public String getFall() {
        return this.fall;
    }
    public String getYear() {
        return this.year;
    }
    public double getReclat(){
        return this.reclat;
    }
    public double getReclong(){
        return this.reclong;
    }
    public void searchMeteor(){
        String search = "start chrome https://www.google.com/search?q=";
        search += this.getName().replaceAll("\\s", "+");
        try {
            Runtime.getRuntime().exec(new String[]{"cmd", "/c", search+="+meteorite"});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}