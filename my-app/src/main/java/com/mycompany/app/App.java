package com.mycompany.app;
//import com.google.* ;
import com.google.common.collect.*;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mycompany.app.Annotation.Important;

/**
 * Hello world!
 *
 */

interface drawShape{

    public void draw() ;
}

public class App
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new AppModule()); // initialize pending
        Request obj = injector.getInstance(Request.class) ;

        obj.makeRequest();
    }
}
