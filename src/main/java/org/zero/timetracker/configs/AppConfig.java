package org.zero.timetracker.configs;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public DozerBeanMapper getBeanMapper() {
		DozerBeanMapper beanMapper = new DozerBeanMapper();
		return beanMapper;
	} 

}
