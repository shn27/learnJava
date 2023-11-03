package com.mycompany.app.GuiceExample;
//import com.google.* ;
import com.google.inject.Guice;
import com.google.inject.Injector;

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
        Request obj1 = injector.getInstance(Request.class) ;

        if(obj.getRequest() == obj1.getRequest()) System.out.println("They are equal");
        else System.out.println("Nope");

        if(obj == obj1 ) System.out.println("They are equal ahhh ");
        else System.out.println("Nope ahhh");

        obj.makeRequest();
    }
}
