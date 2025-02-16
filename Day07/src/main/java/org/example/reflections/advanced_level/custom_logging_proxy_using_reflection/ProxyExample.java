package org.example.reflections.advanced_level.custom_logging_proxy_using_reflection;

import java.lang.reflect.*;

public class ProxyExample {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();

        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingProxy(greeting)
        );

        proxyInstance.sayHello("John");
    }
}

