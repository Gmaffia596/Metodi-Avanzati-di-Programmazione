package database;

public class DatabaseConnectionException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String messaggio;
	
	public DatabaseConnectionException() {
		messaggio = "Errore nella connessione al database";
	}
	
}
