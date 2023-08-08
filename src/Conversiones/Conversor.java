package Conversiones;

import javax.swing.JOptionPane;

import UnidadesConversion.*;

public class Conversor {
	private String unidad1;
	private String valorUnidad1;
	private String unidad2;
	private String valorUnidad2;
	private double valor;
	private double formula;
	private String formulaOperacion;

	public String getFormulaOp() {
		return this.formulaOperacion;
	}

	public double getFormula() {
		return this.formula;
	}

	public Conversor(Unidades unidad) {

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

	public void getMonedas(Unidades unidad) {

		Object Moneda[][] = new Object[2][unidad.UnidaDiv[0].length];

		for (int i = 0; i < unidad.UnidaDiv[0].length; i++) {
			for (int m = 0; m <= 1; m++) {
				if (unidad.UnidaDiv[0][i] != null) {
					Moneda[m][i] = unidad.UnidaDiv[m][i];
				}
			}
		}

		this.unidad1 = unidad.getTipo();
		this.unidad2 = unidad.getTipoAconvertir();
		
		for (int i = 0; i < unidad.UnidaDiv[0].length; i++) {

			if (Moneda[0][i] == unidad1) {
				this.valorUnidad1 = (Moneda[1][i].toString());
			}
			if (Moneda[0][i] == unidad2) {
				this.valorUnidad2 = (Moneda[1][i].toString());
			}

		}
	}

	public void operacionConvertirDiv() {
		Double valor1 = new Double(valorUnidad1);
		Double valor2 = new Double(valorUnidad2);
		
		this.formula = (valor / (valor1) * valor2);

		this.formulaOperacion = (valor + " / " + valorUnidad1 + " * " + valorUnidad2);
	}

	public void operacionConvertirTemp() {

		switch (unidad1) {
		case "Grados Celsius":
			if (unidad2 == "Grados FharenHeit") {
				this.formula = valor * 9 / 5 + 32;
				this.formulaOperacion = valor + "* 9 /5 + 32";
			} else {
				this.formula = valor + 273.15;
				this.formulaOperacion = valor + "273.15";
			}
			break;
		case "Grados FharenHeit":
			if (unidad2 == "Grados Celsius") {
				this.formula = (valor - 32) * 5 / 9;
				this.formulaOperacion = "(" + valor + " - 32)" + " * 5 / 9";
			} else {
				this.formula = (valor - 32) * 5 / 9 + 273.15;
				this.formulaOperacion = "(" + valor + " - 32)" + " * 5 / 9 + 273.15";
			}
			break;
		case "Grados Kelvin":
			if (unidad2 == "Grados Celsius") {
				this.formula = valor - 273.15;
				this.formulaOperacion = valor + " - 273.15";
			} else {
				this.formula = (valor - 273.15) * 9 / 5 + 32;
				this.formulaOperacion = "(" + valor + " - 273)" + " * 9 / 5 + 32";

			}

			break;
		default:
			this.formulaOperacion = "Unidad de temperatura no valida";
			break;
		}

	}

	public void operacionConvertir() {
		switch (unidad1) {
		case "Centimetro":
			if (unidad2 == "Metro") {
				this.formula = valor / 100;
			} else {
				this.formula = valor / 2.54;
			}
			break;
		case "Metro":
			if (unidad2 == "Centimetro") {
				this.formula = valor * 100;
			} else {
				this.formula = valor * 39.54;
			}
			break;
		case "Pulgada":
			if (unidad2 == "Centimetro") {
				this.formula = valor * 2.54;
			} else {
				this.formula = valor / 39.37;
			}
			break;
		default:
			this.formulaOperacion = "Unidad no valida";
			break;
		}
	}

	public double conversion() {
		return this.formula;
	}

}
