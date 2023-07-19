package com.student.marksheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentMarkSheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMarkSheetApplication.class, args);
	}
	@Configuration
	public class MarkSheetConfig {
	    @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

		public Object getRollNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		public int getSem1Total() {
			// TODO Auto-generated method stub
			return 0;
		}

		public int getSem2Total() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

}
