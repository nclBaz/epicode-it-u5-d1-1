package riccardogulin.d1.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
@Component
public class FullstackStudent implements IStudent {
	@Autowired
	String name;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void answersQuestion() {
		log.info("Ciao sono uno studente FS e so tutto");

	}

}
