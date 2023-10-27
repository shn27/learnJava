package Basic;

public class TwoD_ArrayExample {
    public void fun( ){
        int[ ][ ] ara = new int[5][5] ;
        int i , j , x = 1 ; i = j = 0 ;
        while(i < 5 ){
            j = 0 ;
            while(j < 5 ){
                ara[i][j++] = x ;
            }
            i++;x++ ;
        }

        i = j = 0 ;
        while(i < 5 ){
            while(j < 5 ){
                System.out.print(ara[i][j++] + " ");
            }
            j = 0 ;
            System.out.println();
            i++;x++ ;
        }
        System.out.println();
        System.out.println();

        for(int it[]: ara){
            for(int it1:it){
                System.out.print(it1 + " ");
            }
            System.out.println();
        }
    }
}
