package Enumeration;

public class EnumerationExample {
    enum Apple{
        Green(10) , White(20) , Red(30) , Yellow ;
        private int price ;
        Apple(int p ){ price = p ; }
        Apple(){ price = -1; }
        int getPrice( ){return price ; }
    }

    public void demo( ){
        Apple ap ;
        for(Apple apple : Apple.values()){
            System.out.println(apple + "Price " + apple.getPrice());
        }
        ap = Apple.Red ;
        System.out.println(ap + " dam " + ap.getPrice());
        System.out.println(Apple.valueOf("White") + " dam " + Apple.valueOf("White").getPrice() );

    }
}
