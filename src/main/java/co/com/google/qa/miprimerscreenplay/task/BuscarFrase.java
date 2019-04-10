package co.com.google.qa.miprimerscreenplay.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import co.com.google.qa.miprimerscreenplay.models.Phrase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Enter;

import static co.com.google.qa.miprimerscreenplay.userinterfaces.GoogleHomePage.SEARCH_BAR;
import static co.com.google.qa.miprimerscreenplay.userinterfaces.GoogleHomePage.SEARCH_BUTTON;

public class BuscarFrase implements Task{

	private String frase;
	
	public BuscarFrase(String frase) {
		this.frase = frase;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(frase).into(SEARCH_BAR).thenHit(Keys.ENTER)
				);
	}
	//Click.on(SEARCH_BUTTON)
	
	public static BuscarFrase compuestaDeLasPalabras(Phrase phrase) {
		return instrumented(BuscarFrase.class, phrase.getCadenauno() + " " + phrase.getCadenados());
	}

}
