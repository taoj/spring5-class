package com.steven.demo1;

import com.steven.demo1.controllers.ProfileTestingController;
import com.steven.demo1.controllers.QualifierTestController;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {

	  ConfigurableApplicationContext ctx = SpringApplication.run(Demo1Application.class, args);

	  QualifierTestController qtc = (QualifierTestController) ctx.getBean("qualifierTestController");

	  qtc.chnGreetings();
	  qtc.engGreetings();

    ProfileTestingController profileTestingController = (ProfileTestingController) ctx.getBean("profileTestingController");
    profileTestingController.profileTest();
	}

}
