package io.github.tehcjs.javamirror.access;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.Class;

@Target({ElementType.METHOD})
public @interface Method {
	String target();
	Class<?> origin() default Object.class;
}
