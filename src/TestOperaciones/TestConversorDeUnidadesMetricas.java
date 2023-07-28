package TestOperaciones;

import UnidadesConversion.UnidadesMetricas;
import Conversiones.Conversor;
public class TestConversorDeUnidadesMetricas {

	public static void main(String[] args) {
		UnidadesMetricas cm = new UnidadesMetricas("Pulgadas", 50, "m");
		
		Conversor op= new Conversor(cm);
		op.operacionConvertir();
		
		System.out.println(op.conversion());
	}
}
