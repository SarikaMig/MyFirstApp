package com.test.MyFirstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.ApplicationContext;
 
@EnableAutoConfiguration
 
@SpringBootApplication
 
 
public class MyFirstAppApplication  implements CommandLineRunner {
	private static final String SYSTEM_NAME_INFO = "My Example Application";
    private static final String VERSION="0.0.1";

    @Autowired
    private ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(MyFirstAppApplication.class, args);
	}
	
	@Value("#{buildProperties.get('version')}")           // not 'build.version'
	private static String myAppBuildVersion;
	
	@Override
    public void run(String[] args) throws Exception{
        BuildProperties buildProperties = context.getBean(BuildProperties.class);
        displayInfo(buildProperties);
    }

    private static void displayInfo(BuildProperties buildProperties) {
      System.out.println ("build version is <" + buildProperties.getVersion() + ">");
     // System.out.println("value for custom key 'foo' is <" + buildProperties.get("foo") + ">");
      
		 System.out.println(buildProperties.getVersion());
		 System.out.println(buildProperties.getTime());
		 System.out.println(myAppBuildVersion);
    }
}
