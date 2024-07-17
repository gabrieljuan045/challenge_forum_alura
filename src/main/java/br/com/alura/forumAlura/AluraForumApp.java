package br.com.alura.forumAlura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AluraForumApp {

	public static void main(String[] args) {
		SpringApplication.run(AluraForumApp.class, args);
	}

}
