package com.mycompany.app;

import com.google.inject.AbstractModule;
import com.google.inject.Scope;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import com.mycompany.app.Annotation.Important;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
       bind(drawShape.class).to(drawCircle.class).in(Scopes.SINGLETON)  ;
       bind(String.class ).toInstance("Green");
     //  bind(Integer.class).toInstance(15);
        bind(Integer.class).annotatedWith(Important.class).toInstance(20);
        bind(Request.class).in(Scopes.SINGLETON) ;
    }
}
