package StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {

    public StreamApiExample() {
        super();
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>() ;
        list1.add(10) ;
        list1.add(20) ;
        list1.add(21) ;
        list1.add(25) ;
        list1.add(25) ;
        list1.add(10) ;

        System.out.println(list1);

        List<Integer> collect = list1.stream().sorted().collect(Collectors.toList()) ;
        System.out.println(collect);

        Stream<Integer> stream1 = list1.stream();


        stream1.forEach(e->{
            System.out.print(e + " ");
                });
        System.out.println();


        Integer integer = list1.stream().min(Comparator.naturalOrder()).get() ;
        System.out.println(integer);

        List<Integer> list2 = Arrays.asList( 2, 3 , 4 , 5, 6 , 7, 8 , 9 , 10 , 1) ;
       // list2.add(11) ;
        System.out.println(list2);

       Predicate<Integer> predicate = new Predicate<Integer>() {
           @Override
           public boolean test(Integer x) {
               return x%2 == 1;
           }
       } ;
        Function<Integer , Integer> function =  n-> {
            if (n <= 5) n *= 2;
            return n;
        };

        list2.stream()
                .filter(predicate)
                .map(function)
                .sorted()
                .forEach(x-> System.out.println(x));

    }
}
