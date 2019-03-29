package data;

public class OutOfRangeSampleSize extends Exception {
	
	private static final long serialVersionUID = 1L;
	public String error;
	
	public OutOfRangeSampleSize() {
		error = "ERRORE: Numero inserito non valido!";
	}
}
