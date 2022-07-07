package com.test.isobar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.test.isobar.dao.NetworkDAO;



@SpringBootApplication
@EnableCaching
public class IsobarApplication {
	
	@Autowired
	NetworkDAO dao;
	
//	private static final Logger log = LoggerFactory.getLogger(IsobarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(IsobarApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
////			ResponseData data = restTemplate.getForObject(
////					"https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full", ResponseData.class);
//			
//			String data = dao.request("https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full");
//			
//			log.info(data);
//		};
//	}

}
