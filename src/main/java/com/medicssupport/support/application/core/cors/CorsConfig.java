package com.medicssupport.support.application.core.cors;

import com.medicssupport.support.application.constants.ApiConstants;
import com.medicssupport.support.application.constants.AppConstants;
import com.medicssupport.support.application.constants.HttpConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
public class CorsConfig {
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration configuration = new CorsConfiguration();

        // allow only specific origin(s)
        configuration.setAllowedOriginPatterns(Arrays.asList(AppConstants.ALLOWED_ORIGIN_TEST_URL, AppConstants.ALLOWED_ORIGIN_MEDICS_SUPPORT_URL));

        // allowed methods
        configuration.setAllowedMethods(Arrays.asList(HttpConstants.GET, HttpConstants.POST, "PUT", "DELETE")); //"PUT", "DELETE"

        // allowed headers
        configuration.setAllowedHeaders(Arrays.asList("*")); //Arrays.asList(HttpHeaders.CONTENT_TYPE, HttpHeaders.AUTHORIZATION));

        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        // ✅ Apply CORS only for selected endpoints
        source.registerCorsConfiguration(ApiConstants.ANY_PATH, configuration);

        return source;

    }
}
