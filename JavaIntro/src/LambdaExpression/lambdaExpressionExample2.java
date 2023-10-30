package LambdaExpression;

public class lambdaExpressionExample2 {
    public static void main(String[] args) {
        lambdaExpressionExample obj = (a , b) -> {
            System.out.println("Hello world " + (a+b) );
            return a*b ;
        };
        System.out.println("multiply = " + obj.add(5 , 6 )); ;
    }
}
