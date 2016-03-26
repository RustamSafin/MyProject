package com.springapp.mvc.aspects.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * По этой аннотации в request добавляется список категорий для меню из MainMenuAspect
 *
 * Gataullin Kamil
 * 14.03.2016 23:31
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IncludeMenuInfo {
}
