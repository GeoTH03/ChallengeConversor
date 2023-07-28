package Conversiones;

import UnidadesConversion.*;
public class Conversor {
	private String unidad1;
	private double valorUnidad1;
	private String unidad2;
	private double valorUnidad2;
	private double valor;
	private double formula;
	private String formulaOperacion;
	public String getFormulaOp(){
		return this.formulaOperacion;
	}
	
	public double getFormula() {
		return this.formula;
	}

	static Object Moneda[][] = new Object[2][10];

	public Conversor(Divisas unidad) {

		getMonedas(unidad);
		this.valor = unidad.getValor();
	}
	
	public Conversor(Temperaturas temp) {
		this.unidad1 = temp.getTipo();
		this.unidad2 = temp.getTipoAconvertir();
		this.valor = temp.getValor();
	}

	public Conversor(UnidadesMetricas medida) {
		this.unidad1 = medida.getTipo();
		this.unidad2 = medida.getTipoAconvertir();
		this.valor = medida.getValor();
	}

	public void getMonedas(Divisas unidad) {
		unidad.getUnidad();
		for (int i = 0; i < unidad.Monedas[0].length; i++) {
			for (int m = 0; m <= 1; m++) {

				Moneda[m][i] = unidad.Monedas[m][i];
			}
		}

		this.unidad1 = unidad.getTipo();
		this.unidad2 = unidad.getTipoAconvertir();

		for (int i = 0; i < unidad.Monedas[0].length; i++) {

			if (Moneda[0][i] == unidad1) {
				this.valorUnidad1 = (double) (Moneda[1][i]);
				// System.out.println(valorUnidad1);
			}
			if (Moneda[0][i] == unidad2) {
				this.valorUnidad2 = (double) (Moneda[1][i]);
				// System.out.println(valorUnidad2);
			}

		}
		// System.out.println(unidad.Monedas[0].length);
	}

	public void operacionConvertirDiv() {

		this.formula = (valor / valorUnidad1) * valorUnidad2;

		this.formulaOperacion = (valor +" / " + valorUnidad1 +" * "+valorUnidad2);
	}

	public void operacionConvertirTemp() {

		switch (unidad1) {
		case "Grados Celsius":
			if (unidad2 == "Grados FharenHeit") {
				this.formula = valor * 9 / 5 + 32;
				this.formulaOperacion = valor+ "* 9 /5 + 32";
			} else {
				this.formula = valor + 273.15;
				this.formulaOperacion  = valor + "273.15";
			}
			break;
		case "Grados FharenHeit":
			if (unidad2 == "Grados Celsius") {
				this.formula = (valor - 32) * 5 / 9;
				this.formulaOperacion = "("+valor+" - 32)"+" * 5 / 9";
			} else {
				this.formula = (valor - 32) * 5 / 9 + 273.15;
				this.formulaOperacion = "("+valor+" - 32)"+" * 5 / 9 + 273.15";
			}
			break;
		case "Grados Kelvin":
			if (unidad2 == "Grados Celsius") {
				this.formula = valor - 273.15;
				this.formulaOperacion = valor +" - 273.15";
			} else {
				this.formula = (valor - 273.15) * 9 / 5 + 32;
				this.formulaOperacion = "("+valor+" - 273)"+" * 9 / 5 + 32";
				
			}

			break;
		default:
			System.out.println("Unidad de temperatura no valida");
			break;
		}

	}

	public void operacionConvertir() {
		switch (unidad1) {
		case "cm":
			if (unidad2 == "m") {
				this.formula = valor / 100;
			}
			else {
				this.formula = valor /2.54;
			}
			break;
		case "m":
			if (unidad2 == "cm") {
				this.formula = valor * 100;
			}
			else {
				this.formula = valor * 39.54;
			}
			break;
		case "Pulgadas":
			if(unidad2=="cm") {
				this.formula = valor/2.54;
			}
			else {
				this.formula = valor/39.37;
			}
			break;
		}
	}

	public double conversion() {
		return this.formula;
	}

}
