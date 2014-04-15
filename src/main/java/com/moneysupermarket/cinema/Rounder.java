package com.moneysupermarket.cinema;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: danfaulkner
 * Date: 15/04/2014
 * Time: 11:00
 * To change this template use File | Settings | File Templates.
 */
public class Rounder {

    public BigDecimal round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd;
    }

    public BigDecimal multiply(BigDecimal value,int multiply )
    {
       return value.multiply(new BigDecimal(multiply));

    }

    public BigDecimal divide(BigDecimal value,int division)
    {
        return value.divide(new BigDecimal((division)));
    }

}
