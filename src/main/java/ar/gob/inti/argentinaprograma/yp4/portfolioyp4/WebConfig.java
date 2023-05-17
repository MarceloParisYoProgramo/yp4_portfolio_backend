package ar.gob.inti.argentinaprograma.yp4.portfolioyp4;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override	
	public void addCorsMappings(CorsRegistry registry) {
		System.out.println("agregando cors");
		registry.addMapping("/**");
	}
}