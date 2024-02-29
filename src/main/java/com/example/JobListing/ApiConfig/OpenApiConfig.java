package com.example.JobListing.ApiConfig;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;

@Configuration
public class OpenApiConfig {
    @Bean
    OpenAPI customOpenApi() {
        return new OpenAPI().info(
                new Info()
                        .title("4 swagger tool")
                        .version("v1")
                        .description("welcome to dhruv's swagger")
                        .termsOfService("https://springdoc.org/")
                        .license(
                                new License()
                                        .name("OpenSource")
                                        .url("https://springdoc.org/")
                        )
        );

    }
}
