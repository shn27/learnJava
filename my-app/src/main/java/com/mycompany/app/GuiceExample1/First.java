package com.mycompany.app.GuiceExample1;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class First {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppModule()) ;
        DiscountRequest discountRequest = injector.getInstance(DiscountRequest.class) ;
        discountRequest.makeRequest( ) ;
    }
}
