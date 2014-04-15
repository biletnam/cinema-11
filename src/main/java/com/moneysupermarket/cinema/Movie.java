package com.moneysupermarket.cinema;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: danfaulkner
 * Date: 15/04/2014
 * Time: 14:53
 * To change this template use File | Settings | File Templates.
 */
public class Movie {

    //TODO: make String startTime a little more sophisticated (ie array of (java.util.date) dates and times)
    private String title;
    private int screenNumber;
    private String startTime;

    public Movie(){

    }

    public Movie(String title, int screenNumber, String startTime){

        this.title=title;
        this.screenNumber=screenNumber;
        this.startTime=startTime;
    }

    public String getTitle() {
        return title;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public String getStartTime() {
        return startTime;
    }
}
