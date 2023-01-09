package me.yoonhc.springbootstudy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.persistence.Inheritance;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.CONSTRUCTOR})
public @interface MyAnnotation {

    String value() default "yoons";

    int number() default 100;
}
