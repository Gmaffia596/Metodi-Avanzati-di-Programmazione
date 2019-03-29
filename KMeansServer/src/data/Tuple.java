package data;

import java.io.Serializable;

public class Tuple implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Item[] tuple;
	
	//
	public Tuple(int size){		//numero di item che costituirà la tupla
		tuple=new Item[size];
	}
	//-
	
	public int getLength() {
		return tuple.length;
	}
	
	public Item get(int i) {
		return tuple[i];
	}
	
	void add(Item c,int i) {
		tuple[i] = c;
	}
	
	
	public double getDistance(Tuple obj) {
		double distance = 0.0;
		for(int i=0;i<tuple.length;i++) {
			distance=distance + tuple[i].distance(obj.get(i));
		}
		return distance;
	}
	
	/*
	
	public double getDistance(Tuple obj) {
		double distance= 0.0;
		int currentLength;
		if(obj.getLength()>this.getLength()) {
			currentLength=this.getLength();
		}else {
			currentLength=obj.getLength();
		}
		for(int i=0; i<currentLength; i++) {
			distance = distance + this.get(i).distance(obj.get(i).getValue());	
		}
		return distance;
		
	}
	
	*/
	
	public double avgDistance(Data data, int clusteredData[]) {
		double p=0.0; 
		double sumD=0.0;
		for(int i=0; i<clusteredData.length; i++) {
			double d= getDistance(data.getItemSet(clusteredData[i]));
			sumD+=d;
		}
		p=sumD/clusteredData.length;
		return p;
	}
	
}
