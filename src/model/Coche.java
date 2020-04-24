package model;

public class Coche extends Vehiculo {

	private String combustible;

	
//	public Coche(String combustible) {
//		super();
//		this.combustible = combustible;
//	}

	public Coche(String marca, String modelo, int ruedas, String color, int cilindrada, String combustible) {
		super(marca, modelo, ruedas, color, cilindrada);
		this.combustible = combustible;
	}


	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}


	@Override
	public String toString() {
		return "Coche [combustible=" + combustible + ", Vehiculo=" + super.toString() + "]";
	}

	
	
	
}
