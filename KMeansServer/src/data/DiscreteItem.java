package data;

import java.io.Serializable;

public class DiscreteItem extends Item implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DiscreteItem(DiscreteAttribute attribute,String value){
		super(attribute, value);
	}
	
	public double distance(Object a) {
		if (this.getValue().equals(a.toString())) {		
			return 0.0;
		}else 
			return 1.0;
	}

}
