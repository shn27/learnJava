package Controller;

import Enumeration.EnumerationExample;
import Inheritance.Inheritance;

public class Check {
    private int x , y ;
    static int a = 10 ;

    public Check(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Check( ) {
    }

    public Check(Check obj ) {
        this.x = obj.getX() ;
        this.y = obj.getY() ;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    int area(   ){
        System.out.println("ji boss");
        return this.x*this.y ;
    }


    public void fun(){
//        int x = -1 ;// x >>>= 1 ;
//      //  System.out.println(x);
//        x = (x == -1)? -5 : 5 ;
//        System.out.println(x);

//        Controller.Controller.Check check = new Controller.Controller.Check() ;
//        check.setX(10);
//        check.setY(20);
//        check.area( ) ;
//        Controller.Controller.Check check1 = new Controller.Controller.Check() ;
//
//        System.out.println(check.getX() + " " + check.getY());

       // System.out.println(Controller.Controller.Check.a);

//        Basic.varArgExample Basic.varArgExample = new Basic.varArgExample() ;
//        int ara[ ] = { 1 , 2 , 3, 4 , 5 , 6 ,7 , 8, 9 , 10} ;
//        Basic.varArgExample.demo( "Hi"  , ara) ;
//        Basic.varArgExample.demo(ara) ;
//        Basic.varArgExample.demo(true , false , false , true) ;

        EnumerationExample enumerationExample = new EnumerationExample() ;
        enumerationExample.demo();

    }
}
