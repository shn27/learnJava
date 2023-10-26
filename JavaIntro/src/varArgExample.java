public class varArgExample {

    void demo( String a , int ... ara){
        for(int it : ara )
            System.out.print(it + " ");
        System.out.println();
    }

    void demo( int ... ara){
        System.out.println("\nBoss.This one is the overloaded one - length " + ara.length );
        for(int it : ara )
            System.out.print(it + " ");
        System.out.println();
    }

    void demo( boolean ... ara){
        System.out.println("\nBoss.This one is the boolean overloaded one - length " + ara.length );
        for(boolean it : ara )
            System.out.print(it + " ");
        System.out.println();
    }

}
