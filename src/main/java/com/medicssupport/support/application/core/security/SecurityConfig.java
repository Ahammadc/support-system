package com.medicssupport.support.application.core.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // ✅ Enable CORS
                .cors(Customizer.withDefaults())

                // ✅ CRITICAL: Disable CSRF for REST APIs with Basic Auth
                .csrf(csrf -> csrf.disable())

                // ✅ Configure authorization
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/login", "/error", "/public/**").permitAll()
                        .anyRequest().authenticated()
                )

                // ✅ Enable HTTP Basic Authentication
                .httpBasic(Customizer.withDefaults())

                // ✅ CRITICAL: Return 401 instead of redirecting to login page
                .exceptionHandling(ex -> ex
                        .authenticationEntryPoint((request, response, authException) -> {
                            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                            response.setContentType("application/json");
                            response.setCharacterEncoding("UTF-8");
                            response.getWriter().write(
                                    "{\"error\":\"Unauthorized\",\"message\":\"Valid authentication credentials required\"}"
                            );
                        })
                )

                // ✅ Stateless session for REST API
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )

                // ✅ Disable form login (prevents redirects)
                .formLogin(form -> form.disable());

        return http.build();
    }
}