package com.meteorfinder;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Meteors meteors = new Meteors();
        String year = "2001";
        if(meteors.getMeteorsByDate(year).isEmpty()) {
            System.out.println("There are no record of a meteor falling on Earth at that year.");
        } else {
            for(Meteor meteor : meteors.getMeteorsByDate(year)) {
                meteors.displayMeteor(meteor);  
                meteor.searchMeteor();
            } 
        }

         
    }
}
