package com.mycompany.app.GuiceExample1;

public class NoDiscount implements Discount {
    @Override
    public void giveDiscount() {
        System.out.println( "Discount Type 3 - discount = " +  this.price*0.0 );
    }
}
