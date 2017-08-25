package pt.devhub.antjori.vuespring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * The bootstrap (base) application that will trigger Spring Boot.
 */
@SpringBootApplication(scanBasePackages = "pt.devhub.")
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).run(args);
	}

}
