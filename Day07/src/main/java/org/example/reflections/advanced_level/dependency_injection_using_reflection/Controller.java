package org.example.reflections.advanced_level.dependency_injection_using_reflection;

class Controller {
    @Inject
    private Service service;

    public void execute() {
        service.serve();
    }
}
