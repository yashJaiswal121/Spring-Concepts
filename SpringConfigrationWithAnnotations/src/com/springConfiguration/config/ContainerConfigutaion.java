package com.springConfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springConfiguration.demo.ThirdPartyApiClass;

@Configuration
@PropertySource("classpath:logging.properties")
@ComponentScan("com.springConfiguration.demo")
public class ContainerConfigutaion {

	/*
	 * 1)The @Bean annotation tells Spring that we are creating a bean component manually. 
	 * 2)We didn't specify a scope so the default scope is singleton.
	   3)This specifies that the bean will bean id of "getThirdPartyApi_IOC".
	   
	   4)The method name determines the bean id.  
	   		The @Bean annotation will intercept any requests for "getThirdPartyApi_IOC" bean.
	   		As the return type is the ThirdPartyApiClass interface, this is useful for dependency injection. 
	   		This can help Spring find any dependencies that implement the ThirdPartyApiClass interface.
	   
	   5) The @Bean annotation will intercept any requests for "getThirdPartyApi_IOC" bean. 
	   		Since we didn't specify a scope, the bean scope is singleton. 
	   		As a result, it will give the same instance of the bean for any requests.	
	   		
	   6) Due to Singleton scope,Behind the scenes, during the @Bean interception, it will check in memory of the Spring container (applicationContext) and see if this given bean has already been created.
   		If this is the first time the bean has been created then it will execute the method as normal. It will also register the bean in the application context. So that is knows that the bean has already been created before. Effectively setting a flag.
		The next time this method is called, the @Bean annotation will check in memory of the Spring container (applicationContext) and see if this given bean has already been created. Since the bean has already been created (previous paragraph) then it will immediately return the instance from memory.		
	 * */
	
	@Bean
	public ThirdPartyApiClass getThirdPartyApi_IOC() {
		//By Default scope of it is singleton... So 'obj' only once instantiated(line 16 is executed once). 
		ThirdPartyApiClass obj = new ThirdPartyApiClass();
		return obj;
	}
}
