package model;

public class Vehiculo {

	private String marca;
	private String modelo;
	private int ruedas;
	private String color;
	private int cilindrada;
	
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(String marca, String modelo, int ruedas, String color, int cilindrada) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ruedas = ruedas;
		this.color = color;
		this.cilindrada = cilindrada;
	}

	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", ruedas=" + ruedas + ", color=" + color
				+ ", cilindrada=" + cilindrada + "]";
	}
	
	
}
