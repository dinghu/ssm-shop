package com.fengdu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author tiankong
 *
 */
@Configuration
@EnableSwagger2 
public class SwaggerConfig  {
  
    private ApiInfo apiInfo() {  
        return new ApiInfoBuilder()  
                .title("my-shop小程序，APP，微信Swagger2构建APP RESTful api接口 1.0,地址：https://127.0.0.1//my-shop-api/api/*")  
                .termsOfServiceUrl("https://gitee.com/WiliamWang/my-shop")  
                .contact("tiankong")  
                .version("2.0")  
                .build();  
    }  
    
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))           //加了ApiOperation注解的方法，生成接口文档
            .apis(RequestHandlerSelectors.basePackage("com.fengdu.api"))  //包下的类，生成接口文档
            //.paths(PathSelectors.any())
            .build();
    }
    
}