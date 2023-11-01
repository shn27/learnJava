package com.mycompany.app;

import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
       bind(drawShape.class).to(drawCircle.class) ;
       bind(Request.class).to(subClassrequest.class) ;
    }
}
