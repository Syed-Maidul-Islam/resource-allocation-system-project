package com.example.resourceallocationsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow CORS for React frontend running on port 3000
        registry.addMapping("/api/**")  // Allow all API endpoints under /api
                .allowedOrigins("http://localhost:3000")  // Allow requests from React app
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allow specific HTTP methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true);  // Enable credentials (cookies, HTTP authentication)
    }
}