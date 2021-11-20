package com.vrnda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.vrnda.cfgs.ControllerConfig;
import com.vrnda.cfgs.RepositoryConfig;
import com.vrnda.cfgs.ServiceConfig;

@SpringBootApplication
@Import({ControllerConfig.class,ServiceConfig.class,RepositoryConfig.class})
//@ComponentScan("com.vrnda")
public class Mvc15BootLayeredApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mvc15BootLayeredApplication.class, args);
	}

}
