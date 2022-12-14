package idat.edu.pe.curisinche.turista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfKennedyCurisincheTuristaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfKennedyCurisincheTuristaApplication.class, args);
	}

}
