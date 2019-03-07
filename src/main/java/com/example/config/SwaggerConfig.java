package com.example.config;

import com.google.common.base.Predicates;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*主要解决跨域访问不到地址的问题*/
    private CorsConfiguration buildConfig() {
                 CorsConfiguration corsConfiguration = new CorsConfiguration();
                corsConfiguration.addAllowedOrigin("*");
                 corsConfiguration.addAllowedHeader("*");
                 corsConfiguration.addAllowedMethod("*");
                 corsConfiguration.setAllowCredentials(true);
                 return corsConfiguration;
             }

    @Bean
    public CorsFilter corsFilter() {
           UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            source.registerCorsConfiguration("/**", buildConfig());
             return new CorsFilter(source);

    }
   @Bean
   public Docket swaggerSpringMvcPlugin() {
       return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
   }

}
