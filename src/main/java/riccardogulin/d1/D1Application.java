package riccardogulin.d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;
import riccardogulin.d1.entities.BackendStudent;
import riccardogulin.d1.entities.FullstackStudent;
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

		// configWithConfigurationAnnotation();
		// configWithXML();
		
		configWithComponent();
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

	public static void configWithXML() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		BackendStudent b = (BackendStudent) ctx.getBean("ajeje");
		System.out.println(b);

		Interviewer i = (Interviewer) ctx.getBean("interviewer");
		System.out.println(i.toString());
		ctx.close();
	}

	public static void configWithComponent() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("riccardogulin.d1");
		ctx.refresh();
		FullstackStudent f = ctx.getBean(FullstackStudent.class);
		// f.setName("Ajeje");
		log.info(f.toString());

		ctx.close();
	}

}
