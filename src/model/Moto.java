package model;

public class Moto extends Vehiculo {

	private int peso;

	
//	public Moto(int peso) {
//		super();
//		this.peso = peso;
//	}
	
	public Moto(String marca, String modelo, int ruedas, String color, int cilindrada, int peso) {
		super(marca, modelo, ruedas, color, cilindrada);
		this.peso = peso;
	}


	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	


	@Override
	public String toString() {
		return "Moto [peso=" + peso + ", Vehiculo=" + super.toString() + "]";
	}

	
}
