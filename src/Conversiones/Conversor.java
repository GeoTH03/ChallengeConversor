package Conversiones;

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
		return Math.round(this.formula *100.00) /100.00;
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
		getUnidades(medida);
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

	public void getUnidades(Unidades unidad) {
		Object unit[][] = new Object[2][unidad.UnidaUnid[0].length];

		for (int i = 0; i < unidad.UnidaUnid[0].length; i++) {
			for (int m = 0; m <= 1; m++) {
				if (unidad.UnidaUnid[0][i] != null) {
					unit[m][i] = unidad.UnidaUnid[m][i];
				}
			}
		}

		this.unidad1 = unidad.getTipo();
		this.unidad2 = unidad.getTipoAconvertir();

		for (int i = 0; i < unidad.UnidaUnid[0].length; i++) {

			if (unit[0][i] == unidad1) {
				// JOptionPane.showMessageDialog(null, unidad1);
				this.valorUnidad1 = (unit[1][i].toString());

			}
			if (unit[0][i] == unidad2) {
				this.valorUnidad2 = (unit[1][i].toString());
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
			}
			else if (unidad2 == "Grados Kelvin") {
				this.formula = valor + 273.15;
				this.formulaOperacion = valor + " + 273.15";
			} else {
				this.formula = (valor);
				this.formulaOperacion = "(" + valor + ")";
			}
			break;
			
		case "Grados FharenHeit":
			
			if (unidad2 == "Grados Celsius") {
				this.formula = (valor - 32) * 5 / 9;
				this.formulaOperacion = "(" + valor + " - 32)" + " * 5 / 9";
			}
			else if (unidad2 == "Grados Kelvin") {
				this.formula = (valor - 32) * 5 / 9 + 273.15;
				this.formulaOperacion = "(" + valor + " - 32)" + " * 5 / 9 + 273.15";
			} else {
				this.formula = (valor);
				this.formulaOperacion = "(" + valor + ")";
			}
			break;
			
		case "Grados Kelvin":
			if (unidad2 == "Grados Celsius") {
				this.formula = valor - 273.15;
				this.formulaOperacion = valor + " - 273.15";
			}
			else if (unidad2 == "Grados FharenHeit") {
				this.formula = (valor - 273.15) * 9 / 5 + 32;
				this.formulaOperacion = "(" + valor + " - 273)" + " * 9 / 5 + 32";

			} else {
				this.formula = (valor);
				this.formulaOperacion = "(" + valor + ")";
			}
			break;
			
		default:
			this.formulaOperacion = "Unidad de temperatura no valida";
			break;
		}

	}

	public void operacionConvertir() {
		String guarda;
		Double valor1 = new Double(valorUnidad1);
		Double valor2 = new Double(valorUnidad2);
		switch (unidad1) {
		case "Metro":

			this.formula = (valor / valor1) / valor2;
			this.formulaOperacion = valor + " / " + valor1 + " / " + valor2;

			break;
		default:
			this.formula = (valor * valor1) / valor2;
			this.formulaOperacion = valor + " * " + valor1 + " / " + valor2;
			break;
		}
	}

	public double conversion() {
		return this.formula;
	}

}
