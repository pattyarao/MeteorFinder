package com.meteorfinder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class Meteors {

    private ArrayList<Meteor> meteors;

    Meteors() {
        ArrayList<Meteor> meteors = new ArrayList<Meteor>();
        Gson g = new Gson();
        try(Reader reader = new FileReader("src\\dataset\\meteor.json")) {
            JsonArray jsonArr = g.fromJson(reader, JsonArray.class);
            for (JsonElement jsonElem : jsonArr) {
                Meteor meteor = g.fromJson(jsonElem, Meteor.class);
                meteors.add(meteor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.meteors = meteors;
    }
    public ArrayList<Meteor> getMeteors() {
        return this.meteors;
    }

    public ArrayList<Meteor> getMeteorsByDate(String dateInput) {
        ArrayList<Meteor> filteredMeteors = new ArrayList<Meteor>();
        for(Meteor meteor : this.meteors) {
            String meteorDate = meteor.getYear().substring(0,4);
            if(dateInput.equals(meteorDate)){
                filteredMeteors.add(meteor);
            }
        }
        return filteredMeteors;
    }

    public void displayMeteor(Meteor meteor) {
        System.out.println("Meteor name: " + meteor.getName() + "\nMeteor Location [lat, long]: [" + meteor.getReclat() + ", " + meteor.getReclong() + "]");
        System.out.println("Crash Year: " + meteor.getYear().substring(0,4));
        System.out.println("Mass (grams): " + meteor.getMass());
        System.out.println("----------------------------------------------------------");
    }
}
