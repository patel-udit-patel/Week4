package org.example.reflections.advanced_level.dependency_injection_using_reflection;

import java.lang.reflect.Field;

class DependencyInjector {
    public static void injectDependencies(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.set(obj, dependency);
            }
        }
    }
}
