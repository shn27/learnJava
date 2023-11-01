package Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationExample {
    int var1 ;
    String str ;

    public AnnotationExample(int var1, String str) {
        this.var1 = var1;
        this.str = str;
    }

    public AnnotationExample() {
    }

    void demo(){
        System.out.println("Hello world");
    }
    @MyAnno
    void demo1(){
        System.out.println("Hello world 1");
    }

    public static void main(String[] args) {
        AnnotationExample obj = new AnnotationExample() ;
        for(Method method: obj.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(MyAnno.class)){
                try {
                    method.invoke( obj) ;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
