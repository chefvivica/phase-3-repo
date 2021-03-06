package com.springboot.web.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.common.base.Predicate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket postsApi() {
    	return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.springboot.web")).build();
    }
    private Predicate<String> postPaths() {
        return or(regex("/api/posts.*"), regex("/list-todos.*"));
    }
}