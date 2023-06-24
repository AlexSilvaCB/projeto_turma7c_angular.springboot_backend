package silvacb.alex.turma7C;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "silvacb.alex.turma7C.entidades")
@SpringBootApplication
public class Turma7CApplication {

	public static void main(String[] args) {
		SpringApplication.run(Turma7CApplication.class, args);
	}

}
