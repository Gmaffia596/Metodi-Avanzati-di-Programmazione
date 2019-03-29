package database;

public class EmptySetException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String messaggio;
	
	public EmptySetException() {
		messaggio = "ResultSet vuoto!";
	}
	
}
