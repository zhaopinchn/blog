package com.blog.security;

import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Optional;

/**
 * Created by admin on 2017/7/12.
 */
public class PreAuthFilter extends AbstractPreAuthenticatedProcessingFilter {

    private final String AUTH_COOKIE = "b-token";

    @Override
    protected Object getPreAuthenticatedPrincipal(HttpServletRequest httpServletRequest) {
        return getAuthToken(httpServletRequest);
    }

    @Override
    protected Object getPreAuthenticatedCredentials(HttpServletRequest httpServletRequest) {
        return null;
    }

    private Optional<String> getAuthToken(HttpServletRequest request) {
        return Arrays.asList(request.getCookies()).stream()
            .filter(c -> AUTH_COOKIE.equalsIgnoreCase(c.getName())).map(Cookie::getValue).findFirst();
    }
}
