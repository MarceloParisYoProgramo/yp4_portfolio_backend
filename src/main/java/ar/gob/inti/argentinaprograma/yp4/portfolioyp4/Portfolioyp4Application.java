package ar.gob.inti.argentinaprograma.yp4.portfolioyp4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableJpaRepositories
@ComponentScan
//@EntityScan
public class Portfolioyp4Application {

	public static void main(String[] args) {
		SpringApplication.run(Portfolioyp4Application.class, args);
	}

}
