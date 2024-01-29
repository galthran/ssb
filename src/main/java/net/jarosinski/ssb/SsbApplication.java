package net.jarosinski.ssb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("net.jarosinski.ssb.repository")
@EntityScan("net.jarosinski.ssb.model")
public class SsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsbApplication.class, args);
	}

}
