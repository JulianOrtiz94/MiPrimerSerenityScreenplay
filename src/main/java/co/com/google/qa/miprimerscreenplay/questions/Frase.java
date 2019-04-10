package co.com.google.qa.miprimerscreenplay.questions;

import co.com.google.qa.miprimerscreenplay.userinterfaces.GoogleResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("validar resultado")
public class Frase implements Question<String>  {
	
	public Frase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String answeredBy(Actor actor) {
		
		// TODO Auto-generated method stub
		return GoogleResultPage.SEARCH_BAR.resolveFor(actor).waitUntilVisible().getValue();
	}
	
	public static Frase searched() {
		return new Frase();
	}


}

