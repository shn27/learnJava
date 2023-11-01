package Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationExample {
    int var1 ;

    @MyAnno()
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
    @MyAnno(time = 3)
    void demo1(){
        System.out.println("Hello world 1");
    }

    public static void main(String[] args) {
        AnnotationExample obj = new AnnotationExample(10 , "Yes") ;

        for(Field field : obj.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(MyAnno.class)){
                System.out.println(field.getName());
            }
        }

        for(Method method: obj.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(MyAnno.class)){
                try {
                    MyAnno myAnno = method.getAnnotation(MyAnno.class) ;

                    for(int i = 0 ; i <  myAnno.time(); i++){
                       method.invoke( obj) ;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
