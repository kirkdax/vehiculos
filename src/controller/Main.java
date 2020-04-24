package controller;

import model.Coche;
import model.Moto;
import operations.Helper;

public class Main {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("ford", "focus", 4, "azul", 1600, "diesel");
		Moto m1 = new Moto("kawasaki", "z750", 2, "blanco", 750, 220);
		System.out.println(c1.toString());
		System.out.println(m1.toString());
		
		System.out.println("\nCambio de color -> Coche y Moto");
		Helper.cambiarColor(c1, "rojo");
		Helper.cambiarColor(m1, "verde");
		System.out.println(c1.toString());
		System.out.println(m1.toString());
		
		System.out.println("\nCambio de combustible -> Coche");
		Helper.cambiarCombustible(c1, "gasolina");
		System.out.println(c1.toString());

		System.out.println("\nCambio de color -> Moto");
		Helper.cambiarPeso(m1, 200);
		System.out.println(m1.toString());

	}

}
