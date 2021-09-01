package com.javaAnnotationsIOC.FilePropertiesDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("filePropInjector")
public class FilePropertyInjector {

	@Value("${email.username}")
	private String emailUsername;
	
	@Value("${email.password}")
	private String emailPassword;
	
	public void printEmailConfig() {
		System.out.println("Email details loaded as following from property file through xml config:::");
		System.out.println("email username ::: "+emailUsername );
		System.out.println("email password ::: "+emailPassword);
	}
}
