package co.com.google.qa.miprimerscreenplay.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.google.qa.miprimerscreenplay.questions.Frase;
import co.com.google.qa.miprimerscreenplay.task.BuscarFrase;
import co.com.google.qa.miprimerscreenplay.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import co.com.google.qa.miprimerscreenplay.exceptions.PhraseNotFound;
import co.com.google.qa.miprimerscreenplay.models.Phrase;

public class BuscarEnGoogleStepDefinition {
	
	GoogleHomePage googleHomePage;
	
	@Managed(driver = "chrome")
	private WebDriver suNavegador;
	private Actor daniel = Actor.named("Daniel");
	
	@Before
	public void actorCanBrowseTheWeb() {
		daniel.can(BrowseTheWeb.with(suNavegador));
	}
	
	@Given("^Daniel esta en el sitio de google$")
	public void danielEstaEnElSitioDeGoogle() throws Exception {
	    
		daniel.wasAbleTo(Open.browserOn().the(googleHomePage));
	}
	
	@When("^el busca la frase compuesta$")
	public void el_busca_la_frase_compuesta(List<Phrase> phrases) throws Exception {
	    
		 daniel.attemptsTo(BuscarFrase.compuestaDeLasPalabras(phrases.get(0)));
	}


	@Then("^el verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String resultadoEsperado) throws Exception {
	    daniel.should(seeThat(Frase.searched(), is(resultadoEsperado)).orComplainWith(PhraseNotFound.class, PhraseNotFound.PHRASE_NOT_FOUND)); 
	    
	}

}
