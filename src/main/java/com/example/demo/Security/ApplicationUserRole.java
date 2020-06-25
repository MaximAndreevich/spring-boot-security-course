package com.example.demo.Security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.demo.Security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_WRITE, COURSE_READ, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permission;

    ApplicationUserRole(Set<ApplicationUserPermission> permission) {
        this.permission = permission;
    }
}
