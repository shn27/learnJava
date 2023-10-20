public class Controller {
    void controller( ){
        Math1 math = new Math1(10 , 20 ) ;
        math.calculate() ;

        Switch  object = new Switch() ;
        object.demo();

        Loop loop = new Loop() ;
        loop.demo();

        Array array = new Array() ;
        array.demo();

        System.out.println("\nMethod OverLoading : ");
        MethodOverloading methodOverloading = new MethodOverloading() ;
        methodOverloading.fun(2 , 3);
        methodOverloading.fun(2 , 3 , 4 );
    }
}
