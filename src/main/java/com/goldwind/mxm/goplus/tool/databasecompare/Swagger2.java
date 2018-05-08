/**
 * Copyright © 2017 goldwind.com.cn. All rights reserved.
 *
 * @Title: Swagger2.java
 * @Prject: mxm-msger
 * @Package: com.goldwind.mxm.msger
 * @Description: Swagger配置
 * @author: lijunfeng
 * @date: 2017/1/10 11:25
 * @version: V1.0
 */
package com.goldwind.mxm.goplus.tool.databasecompare;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: Swagger2
 * @Description: Swagger配置
 * @author: lijunfeng
 * @date: 2017/1/10 11:25
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.goldwind.mxm.goplus.tool.databasecompare.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("test APIs")
                .description("数据库对比工具")
                .termsOfServiceUrl("https://mxm.goldwind.com.cn/")
                .version("1.0")
                .build();
    }

}
