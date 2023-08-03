package TestOperaciones;

import UnidadesConversion.Divisas;
import Conversiones.Conversor;

public class TestConversorDeMonedas {

	public static void main(String[] args) {

		Divisas divisa = new Divisas("MXN"
				+ ""
				+ "", 50, "CLP");

		Conversor operar = new Conversor(divisa);

		divisa.getUnidad();
		operar.operacionConvertirDiv();
		
		//prueba.get("MXN", "CLP", "60");
		}

	}


