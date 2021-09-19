package com.htc.productreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EntityScan("com.htc.productservice.model")
public class ProductreviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductreviewApplication.class, args);
	}

}
