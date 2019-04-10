package co.com.google.qa.miprimerscreenplay.exceptions;

public class PhraseNotFound extends AssertionError{
	public static final String PHRASE_NOT_FOUND ="La frase encontrada no corresponde a la buscqueda";
	
	public PhraseNotFound(String message, Throwable cause) {
		// TODO Auto-generated constructor stub
		super(message, cause);
	}
}
