package TestOperaciones;

import UnidadesConversion.Temperaturas;
import Conversiones.Conversor;

public class TestTemperaturas {
	 
	public static void main(String[] args) {
		Temperaturas temp =  new Temperaturas("K°", 300, "C°");
		Conversor convertir = new Conversor(temp);
		
		convertir.operacionConvertirTemp();
		System.out.println(convertir.conversion());
	}
	
}
