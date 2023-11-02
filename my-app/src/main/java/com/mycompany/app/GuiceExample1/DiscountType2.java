package com.mycompany.app.GuiceExample1;

public class DiscountType2 implements Discount{
    @Override
    public void giveDiscount() {
        System.out.println( "Discount Type 2 - discount = " +  this.price*0.5 );
    }
}
