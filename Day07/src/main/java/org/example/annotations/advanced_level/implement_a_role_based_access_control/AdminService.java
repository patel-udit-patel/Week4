package org.example.annotations.advanced_level.implement_a_role_based_access_control;

// Service with Role Restrictions
class AdminService {
    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task executed!");
    }
}
