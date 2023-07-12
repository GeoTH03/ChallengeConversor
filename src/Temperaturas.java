
public class Temperaturas extends Unidades{
	public static Object[][] Monedas = new Object[2][6];
	public Temperaturas(String tipo, double valor, String tipoAconvertir) {
		super(tipo,valor,tipoAconvertir);
	}
	
	@Override
	public void getUnidad(){
		
		this.Monedas[0][0] = "MXN";
		this.Monedas[1][0] = 16.86;
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
	}
}
