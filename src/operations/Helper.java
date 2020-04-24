package operations;

import model.Coche;
import model.Moto;
import model.Vehiculo;

public class Helper {

	// Vehiculo
	public static void cambiarNumRuedas(Vehiculo v, int numRuedas) {
		v.setRuedas(numRuedas);
	}
	
	public static void cambiarColor(Vehiculo v, String nuevoColor) {
		v.setColor(nuevoColor);
	}
	
	
	// Coche
	public static void cambiarCombustible(Coche c, String combustible) {
		c.setCombustible(combustible);
	}
	
	// Moto
	public static void cambiarPeso(Moto m, int peso) {
		m.setPeso(peso);
	}
	
	
	
}
