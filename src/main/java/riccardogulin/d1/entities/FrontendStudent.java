package riccardogulin.d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Slf4j
public class FrontendStudent implements IStudent {
	private String name;

	@Override
	public void answersQuestion() {
		log.info("La risposta è...blablablabla");
	}
}
