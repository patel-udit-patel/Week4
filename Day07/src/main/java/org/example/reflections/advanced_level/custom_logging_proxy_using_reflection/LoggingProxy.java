package org.example.reflections.advanced_level.custom_logging_proxy_using_reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LoggingProxy implements InvocationHandler {
    private final Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method called: " + method.getName());
        return method.invoke(target, args);
    }
}
