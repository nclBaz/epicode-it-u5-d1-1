package riccardogulin.d1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import riccardogulin.d1.entities.BackendStudent;
import riccardogulin.d1.entities.FrontendStudent;
import riccardogulin.d1.entities.IStudent;
import riccardogulin.d1.entities.Interviewer;

@Configuration
public class BeansConfiguration {

	@Bean(name = "getName") // Obbligatorio usarlo, altrimenti non mi troverà tali Bean
	String name() {
		return "Giorgio";
	}

	@Bean
	int age() {
		return 20;
	}

	@Bean("aldo")
	IStudent fe() {
		return new FrontendStudent("Aldo");
	}

	@Bean("giovanni")
	@Primary
	IStudent be() {
		return new BackendStudent(name());
	}

	@Bean("ajeje")
	@Scope("prototype")
	Interviewer interviewer(IStudent s) {
		return new Interviewer("Ajeje", s);
	}
}
