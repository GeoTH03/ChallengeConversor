package UnidadesConversion;

import Conversiones.ActualizarUnidades;

public class Divisas extends Unidades {
	
	
	public static Object[][] Monedas = new Object[2][10];
	
	public Divisas() {
		getUnidad();
	}
	
	public Divisas(String tipo, double valor, String tipoAconvertir) {
		super(tipo, valor, tipoAconvertir);

		

	}
	@Override
	public void getUnidad(){
		ActualizarUnidades actualizacion = new ActualizarUnidades();
		actualizacion.table.setModel(Object[] model);
		this.Monedas[0][0] = "MXN";
		this.Monedas[1][0] = 16.78;
		this.Monedas[0][1] = "USD";
		this.Monedas[1][1] = 1.0;
		this.Monedas[0][2] = "EUR";
		this.Monedas[1][2] = 0.90;
		this.Monedas[0][3] = "YUAN";
		this.Monedas[1][3] = 7.17;
		this.Monedas[0][4] = "LIBRA ESTERLINAS";
		this.Monedas[1][4] = 0.77;
		this.Monedas[0][5] = "WON";
		this.Monedas[1][5] = 1276.41;
		this.Monedas[0][6] = "ARS";
		this.Monedas[1][6] = 264.39;
		this.Monedas[0][7] = "CLP";
		this.Monedas[1][7] = 813.85;
		}
	
	
	
}
