package com.borsibaar.util;

import com.borsibaar.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.server.ResponseStatusException;

/**
 * Utility class for accessing security context and authenticated user
 * information.
 */
public class SecurityUtils {

    /**
     * Gets the currently authenticated user from the SecurityContext.
     *
     * @return The authenticated User
     * @throws ResponseStatusException if user is not authenticated or not a User
     *                                 instance
     */
    public static User getCurrentUser() {
        return getCurrentUser(true);
    }

    /**
     * Gets the currently authenticated user from the SecurityContext.
     *
     * @param requireOrganization If true, throws exception if user has no
     *                            organization
     * @return The authenticated User
     * @throws ResponseStatusException if user is not authenticated or not a User
     *                                 instance
     */
    public static User getCurrentUser(boolean requireOrganization) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Not authenticated");
        }

        Object principal = authentication.getPrincipal();
        if (!(principal instanceof User)) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid authentication");
        }

        User user = (User) principal;

        if (requireOrganization && user.getOrganizationId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User has no organization");
        }

        return user;
    }
}
