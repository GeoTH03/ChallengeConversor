
public class Unidades {
	
	public static Object[][] Unidad = new Object[2][6];
	
	public Unidades(String tipo, double valor, String tipoAconvertir) {
		this.tipo = tipo;
		this.valor = valor;
		this.tipoAconvertir= tipoAconvertir;
	}
	
	private String tipo;
	private double valor;
	private String tipoAconvertir;
	
	public String getTipo() {
		return tipo;
	}



	public double getValor() {
		return valor;
	}

	

	public String getTipoAconvertir() {
		return tipoAconvertir;
	}

	public void getUnidad(){
		
	}

}
