package io.github.tehcjs.javamirror;

import lombok.SneakyThrows;
import lombok.val;
import lombok.var;

import java.lang.reflect.Method;

public abstract class Mirror {
	@SneakyThrows
	public static Object callStatic(Class<?> klass, String method, Object... args) {
		Method m;
		if (args.length > 0) {
			m = klass.getDeclaredMethod(method, args.getClass());
		} else {
			m = klass.getDeclaredMethod(method);
		}
		m.setAccessible(true);
		return m.invoke(null, args);
	}

	@SneakyThrows
	public static <T> Object call(T instance, String method, Object... args) {
		Method m;
		if (args.length > 0) {
			m = instance.getClass().getDeclaredMethod(method, args.getClass());
		} else {
			m = instance.getClass().getDeclaredMethod(method);
		}
		m.setAccessible(true);
		return m.invoke(instance, args);
	}
}
