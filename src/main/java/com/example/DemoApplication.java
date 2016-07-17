package com.example;

import com.example.api.ApiConfig;
import com.example.client.ClientConfig;
import com.example.common.CommonConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder()
				.parent(CommonConfig.class)
				.child(ApiConfig.class, ClientConfig.class, DemoApplication.class)
				.run(args);
	}

//    @Bean
//    public EmbeddedServletContainerFactory servletContainer() {
//        return new TomcatEmbeddedServletContainerFactory();
//    }

}
