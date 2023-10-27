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

        System.out.println("\nAbstract Class : ");
        AbstractClassExampleSecond abstractClassExampleSecond = new AbstractClassExampleSecond() ;
        abstractClassExampleSecond.demo();

        System.out.println("\nInheritance Class : ");
//        Car car = new Car() ;
//        car.fun();

        System.out.println("\nPolymorphism Example Class : ");
        Dog dog = new Dog() ;
        dog.animalSound();

        Pig pig = new Pig() ;
        pig.animalSound();

        System.out.println("\nInnerClass Example : ");
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());


        System.out.println("\nInterface Example:") ;

        Cat cat = new Cat() ;
        cat.animalSound();
        cat.sleep();

        System.out.println("\nUserInput Example:") ;
        userInputExample userInputExample = new userInputExample() ;
      //  userInputExample.input();

        System.out.println("\nArrayList Example: ");
        ArraylistExample arraylistExample = new ArraylistExample() ;
        arraylistExample.fun();

        System.out.println("\nMultiThread Example: ");
        multiThread multiThread = new multiThread() ;
        Thread thread = new Thread(multiThread) ;
        thread.start();

    }
}
