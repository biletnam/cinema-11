package com.moneysupermarket.cinema;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: danfaulkner
 * Date: 15/04/2014
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {


    Rounder rounder = new Rounder();

    // hard code prices for now
    //TODO: something a bit more sophisticated

    BigDecimal studentPrice = rounder.round(6);
    BigDecimal concessionPrice = rounder.round(5);
    BigDecimal under15Price = rounder.round(4);
    BigDecimal fullPrice = rounder.round(10);


    public BigDecimal totalPriceOfStudentTickets(int numberOfStudentTickets){
        return rounder.multiply(studentPrice,numberOfStudentTickets);
    }

    public BigDecimal totalPriceConcessionTickets(int numberOfConcessionTickets){
        return rounder.multiply(concessionPrice,numberOfConcessionTickets);
    }

    public BigDecimal totalPriceUnder15Tickets(int numberOfUnder15Tickets){
        return rounder.multiply(under15Price,numberOfUnder15Tickets);
    }

    public BigDecimal totalPriceFullPriceTickets(int numberOfFullPriceTickets){
        return rounder.multiply(fullPrice,numberOfFullPriceTickets);

    }

    public BigDecimal totalPriceOfAllTickets(int numberOfStudentTickets,
                                             int numberOfConcessionTickets,
                                             int numberOfUnder15Tickets,
                                             int numberOfFullPriceTickets)
        {
         BigDecimal total = totalPriceOfStudentTickets(numberOfStudentTickets)
                         .add(totalPriceConcessionTickets(numberOfConcessionTickets)
                         .add(totalPriceUnder15Tickets(numberOfUnder15Tickets)
                         .add(totalPriceFullPriceTickets(numberOfFullPriceTickets))));
         if (total == null) {
             total = new BigDecimal(0);
         }
        return total;
    }

}


