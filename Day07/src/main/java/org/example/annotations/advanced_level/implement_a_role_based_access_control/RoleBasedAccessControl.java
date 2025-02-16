package org.example.annotations.advanced_level.implement_a_role_based_access_control;

import java.lang.reflect.Method;

// Access Control Handler
public class RoleBasedAccessControl {
    public static void invokeMethodIfAllowed(Object obj, String methodName, User user) throws Exception {
        Method method = obj.getClass().getMethod(methodName);

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            String requiredRole = method.getAnnotation(RoleAllowed.class).value();

            if (user.getRole().equals(requiredRole)) {
                method.invoke(obj);
            } else {
                System.out.println("Access Denied! User does not have the required role: " + requiredRole);
            }
        } else {
            method.invoke(obj);
        }
    }

    public static void main(String[] args) throws Exception {
        AdminService service = new AdminService();

        User adminUser = new User("ADMIN");
        User guestUser = new User("GUEST");

        invokeMethodIfAllowed(service, "performAdminTask", adminUser); // Allowed
        invokeMethodIfAllowed(service, "performAdminTask", guestUser); // Denied
    }
}
