package data;

import java.io.Serializable;

class ContinousAttribute extends Attribute implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double max; //MASSIMO VALORE CHE L'ATTRIBUTO DI TIPO CONTINUO (NUMERICO) POTREBBE ASSUMERE
	private double min; //MINIMO VALORE CHE L'ATTRIBUTO POTREBBE ASSUMERE
	
	//METODO COSTRUTTORE CHE RICHIAMA IL METODO DELLA SUPER CLASSE "ATTRIBUTE" 
	public ContinousAttribute(String name, int index, double min, double max) {
		super (name, index);
		this.min= min;
		this.max= max;
	}
	
	//METODO PER LA NORMALIZZAZIONE DEL DOMINIO
	//CHE RESTITUISCE IL VALORE NORMALIZZATO
	double getScaledValue(double v) {
		return ((v-this.min)/(this.max-this.min)); 		//VALORE NORMALIZZATO V1

	}
}
