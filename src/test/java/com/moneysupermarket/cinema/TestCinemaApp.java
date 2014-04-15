package com.moneysupermarket.cinema;

import junit.framework.Assert;
import org.junit.Test;

import java.math.BigDecimal;


/**
 * Created with IntelliJ IDEA.
 * User: danfaulkner
 * Date: 15/04/2014
 * Time: 11:32
 * To change this template use File | Settings | File Templates.
 */
public class TestCinemaApp {

    Calculator calculator = new Calculator();
    Promotions promotion = new Promotions();


    @Test
    public void testTotalPriceOfStudentTicketsIs12()
    {
        Assert.assertEquals(new BigDecimal(12),calculator.totalPriceOfStudentTickets(2));
    }

    @Test
    public void testTotalPriceOfConcessionTicketsIs5()
    {
        Assert.assertEquals(new BigDecimal(5),calculator.totalPriceConcessionTickets(1));
    }

    @Test
    public void testTotalPriceOfUnder15TicketsIs4()
    {
        Assert.assertEquals(new BigDecimal(4),calculator.totalPriceUnder15Tickets(1));
    }

    @Test
    public void testTotalPriceOfFullPriceTicketsIs40()
    {
        Assert.assertEquals(new BigDecimal(40),calculator.totalPriceFullPriceTickets(4));
    }

    @Test
    public void testTotalCostOfTicketsIs61()
    {
        Assert.assertEquals(new BigDecimal(61),calculator.totalPriceOfAllTickets(2,1,1,4));
    }

    @Test
    public void test50PercentDiscountIsApplied()
    {
        BigDecimal totalVal = new BigDecimal(61);
        Assert.assertEquals(new BigDecimal(30.50),promotion.fiftyPercentOff(totalVal));
    }


}
