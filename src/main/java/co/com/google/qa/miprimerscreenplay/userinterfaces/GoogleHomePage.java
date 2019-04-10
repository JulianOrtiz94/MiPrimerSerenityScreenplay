package co.com.google.qa.miprimerscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com.co")
public class GoogleHomePage extends PageObject{
	
	public static final Target SEARCH_BAR = Target.the("Barra de busqueda")
			.located(By.xpath("//input[@title='Buscar']"));
	
	public static final Target SEARCH_BUTTON = Target.the("Boton Buscar")
			.located(By.name("btnK"));
	
}
