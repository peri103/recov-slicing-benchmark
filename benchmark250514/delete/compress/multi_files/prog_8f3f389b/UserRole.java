public class UserRole {
    private String role;
    private UserPermissions permissions;

    public UserRole(String role, UserPermissions permissions) {
        this.role = role;
        this.permissions = permissions;
    }

    public void assignPermission() {
        permissions.setPermissionForRole(role);
    }

    public long getAssignedGroupId() {
        return permissions.getEntry().getGroupId();
    }

    public String getRole() {
        return role;
    }
}
