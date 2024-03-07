package com.josiasmartins.forest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConf {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Tree api spring")
                        .description("API Rest Tree")
                        .contact(new Contact()
                                .name("Time backend")
                                .email("http://tree/email")
                        )
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://tree/licenca")
                        )

                )
                .servers(List.of(new Server()
                        .url("http://localhost:8080")
                ))
                .tags(List.of(new Tag()
                        .name("tree")
                        .description("api rest web")

                ));
    }

}
