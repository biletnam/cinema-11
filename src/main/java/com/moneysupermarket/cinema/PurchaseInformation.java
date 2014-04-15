package com.moneysupermarket.cinema;

/**
 * Created with IntelliJ IDEA.
 * User: danfaulkner
 * Date: 15/04/2014
 * Time: 14:19
 * To change this template use File | Settings | File Templates.
 */
public class PurchaseInformation {

    private Movie movie;

    private int studentTickets;
    private int concessionTickets;
    private int under15Tickets;
    private int fullPriceTickets;

public PurchaseInformation() {

    }

    public PurchaseInformation(Movie movie, int studentTickets, int concessionTickets, int under15Tickets, int fullPriceTickets) {
        this.movie = movie;
        this.studentTickets=studentTickets;
        this.concessionTickets=concessionTickets;
        this.under15Tickets=under15Tickets;
        this.fullPriceTickets=fullPriceTickets;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getStudentTickets() {
        return studentTickets;
    }

    public int getConcessionTickets() {
        return concessionTickets;
    }

    public int getUnder15Tickets() {
        return under15Tickets;
    }

    public int getFullPriceTickets() {
        return fullPriceTickets;
    }

}
