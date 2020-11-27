package cn.hyphalosaurus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerRunApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerRunApplication.class, args);
	}

}