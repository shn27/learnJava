package com.mycompany.app.GuiceExample1;

import jakarta.inject.Inject;
import jakarta.inject.Provider;

public class DiscountRequest {
    private final Discount discount ;

    @Inject
    public DiscountRequest(Discount discount) {
        this.discount = discount;
    }
    public void makeRequest() {
        discount.giveDiscount();
    }

//      private final Provider<Discount> discountProvider;
//    @Inject
//    public DiscountRequest(Provider<Discount> discountProvider) {
//        this.discountProvider = discountProvider;
//    }
//    public void makeRequest() {
//        discountProvider.get().giveDiscount();
//    }
}
