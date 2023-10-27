package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistExample {
    public void fun(){
        ArrayList<String> cars = new ArrayList<String>() ;
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.set(0 , "Riksha") ;

        Collections.sort(cars) ;

        for(String it: cars)
            System.out.println(it);

    }
}
