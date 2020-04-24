package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Coche;
import model.Moto;
import operations.Helper;

class HelperTest {

	private Coche c1;
	private Moto m1;
	
	
	@BeforeEach
	public void setup() {		
		this.c1 = new Coche("ford", "focus", 4, "azul", 1600, "diesel");
		this.m1 = new Moto("kawasaki", "z750", 2, "blanco", 750, 220);
	}
	
	
	@Test
	void testCambiarNumRuedas() {
		int ruedasNuevas = 2;
		
		Helper.cambiarNumRuedas(c1, ruedasNuevas);
		assertEquals(ruedasNuevas, c1.getRuedas());
		
		Helper.cambiarNumRuedas(m1, ruedasNuevas);
		assertEquals(ruedasNuevas, m1.getRuedas());
	}

	
	@Test
	void testCambiarColor() {
		String nuevoColor = "verde";
		
		Helper.cambiarColor(c1, nuevoColor);
		assertEquals(nuevoColor, c1.getColor());
		
		Helper.cambiarColor(m1, nuevoColor);
		assertEquals(nuevoColor, m1.getColor());
	}

	
	@Test
	void testCambiarCombustible() {
		String nuevoCombustible = "gasolina";
		
		Helper.cambiarCombustible(c1, nuevoCombustible);
		assertEquals(nuevoCombustible, c1.getCombustible());
	}

	
	@Test
	void testCambiarPeso() {
		int nuevoPeso = 123;
		
		Helper.cambiarPeso(m1, nuevoPeso);
		assertEquals(nuevoPeso, m1.getPeso());
	}

}
