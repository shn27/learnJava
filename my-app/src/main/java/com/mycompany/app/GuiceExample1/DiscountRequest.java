package com.mycompany.app.GuiceExample1;

import jakarta.inject.Inject;
import jakarta.inject.Provider;

public class DiscountRequest {
    private final Discount discount ;

    @Inject
    public DiscountRequest(Discount discount) {
        this.discount = discount;
    }

    //  private final Provider<Discount> discountProvider;

//    public DiscountRequest(Provider<Discount> discountProvider) {
//        this.discountProvider = discountProvider;
//    }
    public void makeRequest() {
        discount.giveDiscount();
    }
}
