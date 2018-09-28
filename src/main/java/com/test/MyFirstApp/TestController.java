package com.test.MyFirstApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
 
 
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
@EnableAutoConfiguration
 
public class TestController {

	//@Autowired
	//BuildProperties buildProperties;
 

	@Autowired
	private Environment environment;

	  @Autowired
	    private ApplicationContext context;
	 @RequestMapping("/topics")
	public String getAllTopics(){
	/*	 System.out.println(environment.getActiveProfiles());
		 System.out.println(buildProperties.getVersion());
		 System.out.println(buildProperties.getTime());
		   BuildProperties buildProperties = context.getBean(BuildProperties.class);
		   System.out.println(buildProperties.getVersion());
		   */
	 
		 return "hellop";
	} 
	 
}
