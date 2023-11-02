package com.mycompany.app.GuiceExample1;

import com.google.inject.ImplementedBy;
import com.sun.security.jgss.GSSUtil;

public class DiscountType1 implements Discount{
    @Override
    public void giveDiscount() {
        System.out.println( "Discount Type 1 - discount = " +  this.price*0.25 );
    }
}
