package org.example.reflections.advanced_level.dependency_injection_using_reflection;

public class DIExample {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        DependencyInjector.injectDependencies(controller);
        controller.execute();
    }
}

