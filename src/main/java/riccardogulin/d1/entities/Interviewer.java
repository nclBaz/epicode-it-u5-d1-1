package riccardogulin.d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class Interviewer {
	IStudent student; // E' UNA DIPENDENZA
	String name;

	public Interviewer(String name, IStudent student) {
		this.name = name;
		this.student = student;
	}

	public void askQuestion() {
		log.warn("hey " + student.getName() + " risolvimi questa challenge...");
		student.answersQuestion();
	}

}
