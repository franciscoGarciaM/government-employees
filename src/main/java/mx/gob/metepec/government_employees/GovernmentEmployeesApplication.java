package mx.gob.metepec.government_employees;

import mx.gob.metepec.government_employees.entity.Area;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GovernmentEmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GovernmentEmployeesApplication.class, args);
		Area area = new Area();
		String atrea = area.getDescription();
	}

}
