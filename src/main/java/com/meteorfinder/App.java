package com.meteorfinder;



/**
 * Hello world!
 *
 */
public class App 
{
   
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Meteors meteors = new Meteors();
        for(Meteor meteor : meteors.getMeteorsByDate("2002")) {
            System.out.println("Meteor name: " + meteor.getName() + "\nMeteor Location [lat, long]: [" + meteor.getReclat() + ", " + meteor.getReclong() + "]");
            System.out.println("Full Crash Date: " + meteor.getYear().substring(0,10));
            System.out.println("----------------------------------------------------------");
        }   

    }
}
