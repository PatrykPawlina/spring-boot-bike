package com.java.springbootbike.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.java.springbootbike.security.ApplicationPermission.*;

public enum ApplicationRole {
    ADMIN(Sets.newHashSet(
            ADMIN_DISPLAY,
            ADMIN_ADD,
            ADMIN_UPDATE,
            ADMIN_DELETE)),
    USER(Sets.newHashSet());

    private final Set<ApplicationPermission> permissions;

    ApplicationRole(Set<ApplicationPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationPermission> getPermissions() {
        return permissions;
    }
}
