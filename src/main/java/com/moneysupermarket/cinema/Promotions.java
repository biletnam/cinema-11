package com.moneysupermarket.cinema;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: danfaulkner
 * Date: 15/04/2014
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */
public class Promotions {

    Calculator calculator = new Calculator();
    Rounder rounder = new Rounder();


    public BigDecimal fiftyPercentOff(BigDecimal value)
    {
      return rounder.divide(value,2);
    }
}
