//package com.spring.linux.common.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer{
//	
//	  @Override 
//	  public void addCorsMappings(CorsRegistry registry) { 
//	    registry
//	      .addMapping("/**")
//	      .allowedOrigins("*") // 에러 발생 함! allowCredentials(true)와 함께 allowedOrigins("*")를 사용할 수 없기 때문에 발생하는 문제입니다. 
//	      					   // 이 경우, 특정 출처를 명시적으로 지정하거나 allowedOriginPatterns를 사용해야 합니다.
//	      .allowedHeaders("*") 
//	      .allowedMethods("*") 
//	      .allowCredentials(true); 
//	  } 
//}

//package com.spring.linux.common.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer{
//	
//	  @Override 
//	  public void addCorsMappings(CorsRegistry registry) { 
//	    registry
//	      .addMapping("/**")
//	      .allowedOriginPatterns("*") // 모든 ip 주소 허용하려면 .allowedOriginPatterns("*") 사용 해야함.
//	      .allowedHeaders("*") 
//	      .allowedMethods("*") 
//	      .allowCredentials(true); 
//	  } 
//}



// 실습용 도커 mysql 컨테이너 실행
// docker run -it --name docker-mysql -e MYSQL_ROOT_PASSWORD=root -d -v /home/docker/data:/var/lib/mysql -p 3308:3306 mysql

package com.spring.linux.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	  @Override 
	  public void addCorsMappings(CorsRegistry registry) { 
	    registry
	      .addMapping("/**")
//	      .allowedOrigins("http://127.0.0.1:3000")
	      .allowedOrigins("http://127.0.0.1:80") // 특정 ip 허용
	      .allowedHeaders("*") 
	      .allowedMethods("*") 
	      .allowCredentials(true); 
	  } 
}