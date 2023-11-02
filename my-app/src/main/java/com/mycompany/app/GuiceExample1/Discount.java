package com.mycompany.app.GuiceExample1;

import com.google.inject.ImplementedBy;
@ImplementedBy(DiscountType1.class)
public interface Discount {
    Integer price = 100 ;

    public void giveDiscount() ;
}
