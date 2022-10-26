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
            meteors.displayMeteor(meteor);
        }   

    }
}
