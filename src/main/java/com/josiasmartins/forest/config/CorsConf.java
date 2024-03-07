package com.josiasmartins.forest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConf {

    @Bean
    WebMvcConfigurer corsConfiguration() {
        return new WebMvcConfigurer() {
          @Override
          public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**") // any endpoint
                    .allowedMethods("GET", "POST", "PUT", "DELETE") // enable methods
                    .allowedOrigins("*"); // enable any origin
          }
        };
    }

}
