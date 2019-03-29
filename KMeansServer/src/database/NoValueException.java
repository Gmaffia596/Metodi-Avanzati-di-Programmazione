package database;

public class NoValueException extends Exception {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String messaggio;
	
	public NoValueException() {
		messaggio = "Nessun contenuto";
	}
	
}
