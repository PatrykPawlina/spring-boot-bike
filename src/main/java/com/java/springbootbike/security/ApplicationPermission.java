package com.java.springbootbike.security;

public enum ApplicationPermission {

    ADMIN_DISPLAY("admin:display"),
    ADMIN_ADD("admin:add"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_DELETE("admin:delete");

    private final String permission;

    ApplicationPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
