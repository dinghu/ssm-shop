package com.fengdu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author tiangkong
 *
 */
@Configuration
@EnableSwagger2 
@EnableWebMvc 	
@ComponentScan(basePackages = { "com.fengdu.controller" })
public class SwaggerConfig  {
    @Bean  
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)  
                .apiInfo(apiInfo())  
                .select()  
                .apis(RequestHandlerSelectors.basePackage("com.fengdu.controller"))  
                .paths(PathSelectors.any())  
                .build();  
    }  
    private ApiInfo apiInfo() {  
        return new ApiInfoBuilder()  
                .title("Spring+Swagger2构建APP RESTful 接口 1.0")  
                .termsOfServiceUrl("https://gitee.com/WiliamWang/my-shop")  
                .contact("tiankong")  
                .version("2.0")  
                .build();  
    }  
}