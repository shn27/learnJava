package Basic;

public class varArgExample {

    public void demo( String a , int ... ara){
        for(int it : ara )
            System.out.print(it + " ");
        System.out.println();
    }

    public void demo( int ... ara){
        System.out.println("\nBoss.This one is the overloaded one - length " + ara.length );
        for(int it : ara )
            System.out.print(it + " ");
        System.out.println();
    }

    public void demo( boolean ... ara){
        System.out.println("\nBoss.This one is the boolean overloaded one - length " + ara.length );
        for(boolean it : ara )
            System.out.print(it + " ");
        System.out.println();
    }

}
