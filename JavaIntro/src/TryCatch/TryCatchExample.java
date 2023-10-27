package TryCatch;

import Basic.Array;

public class TryCatchExample {
    public void demo( ){
        int ara[ ] = new int[10] ;
        System.out.println(ara.length);

        try{
            int a = 0 ;
            System.out.println(10/a);

            try{
                int x = ara[ 11 ] ;
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("boss outOfBound chap " + e );
            }
        }
        catch (Exception e){
            System.out.println("boss chap " + e);
        }

    }
}
