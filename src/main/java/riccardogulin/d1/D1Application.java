package riccardogulin.d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;
import riccardogulin.d1.entities.Interviewer;

@SpringBootApplication
@Slf4j
public class D1Application {

	public static void main(String[] args) {
		SpringApplication.run(D1Application.class, args);

//		FrontendStudent f = new FrontendStudent("Aldo");
//		BackendStudent b = new BackendStudent("Giovanni");
//		Interviewer i = new Interviewer("Riccardo", f);
//
//		i.askQuestion();

		configWithConfigurationAnnotation();
	}

	public static void configWithConfigurationAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(D1Application.class);
//		log.info((String) ctx.getBean("getName"));
//
//		log.info(ctx.getBean("aldo").toString());
//		log.info(ctx.getBean(IStudent.class).toString());
//
//		log.info(ctx.getBean("ajeje").toString());

		Interviewer i1 = ctx.getBean(Interviewer.class);
		Interviewer i2 = ctx.getBean(Interviewer.class);
		log.info(i1.toString());
		log.info(i2.toString());

		ctx.close();
	}

}
