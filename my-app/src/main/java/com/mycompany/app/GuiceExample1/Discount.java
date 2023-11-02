package com.mycompany.app.GuiceExample1;

import com.google.inject.ImplementedBy;
import com.google.inject.ProvidedBy;

//@ImplementedBy(DiscountType1.class)
@ProvidedBy(DiscountProvider.class)
public interface Discount {
    Integer price = 100 ;

    public void giveDiscount() ;
}
