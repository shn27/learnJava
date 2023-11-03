package com.mycompany.app.Annotation;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD , ElementType.FIELD , ElementType.CONSTRUCTOR})
@BindingAnnotation

@Retention(RetentionPolicy.RUNTIME)
public @interface Important {
}
