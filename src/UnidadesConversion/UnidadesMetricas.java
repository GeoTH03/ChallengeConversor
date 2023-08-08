package UnidadesConversion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UnidadesMetricas extends Unidades {
	public static String[][] tiposUnidades = new String [2][20];

	public UnidadesMetricas() {

	}

	public UnidadesMetricas(String unidad1, double valor, String unidad2) {
		super(unidad1, valor, unidad2);
	}

	public void getUnidad() {
		super.getUnidad();
	}
	public void setUnidad(String nombre, String valor) {
		super.setUnidad(nombre, valor);
		/* *
		 * kilómetro km 1000 m hectómetro hm 100 m decámetro dam 10 m metro m 1 m
		 * decímetro dm 0.1 m centímetro cm 0.01 m milímetro mm 0.001 m
		 */
		
		/*
		tiposUnidades.add("Centimetro");
		tiposUnidades.add("Milimetro");
		tiposUnidades.add("Metro");
		tiposUnidades.add("Pulgada");
		tiposUnidades.add("Kilometro");*/

	}

	
}
