
public class Conversor {
	private String unidad1;
	private double valorUnidad1;
	private String unidad2;
	private double valorUnidad2;
	private double valor;
	private double formula;

	static Object Moneda[][] = new Object[2][6];

	public Conversor(Divisas unidad) {

		getMonedas(unidad);
		this.valor = unidad.getValor();
		
	}

	public void getMonedas(Divisas unidad) {
		unidad.getUnidad();
		for (int i = 0; i <= 5; i++) {
			for (int m = 0; m <= 1; m++) {

				Moneda[m][i] = unidad.Monedas[m][i];
			}
		}
		this.unidad1 = unidad.getTipo();
		this.unidad2 = unidad.getTipoAconvertir();
		
		for (int i = 0; i <= 5; i++) {
			
				if(Moneda[0][i]==unidad1) {
					this.valorUnidad1 = (double) (Moneda[1][i]);
					//System.out.println(valorUnidad1);
				}
				if(Moneda[0][i]==unidad2) {
					this.valorUnidad2 = (double) (Moneda[1][i]);
					//System.out.println(valorUnidad2);
				}
				
		}
	}

	public void operacionConvertirDiv() {

		
		 this.formula = (valor/valorUnidad1) * valorUnidad2;

		System.out.println(valor + " " + unidad1 + " Es igual a: " + formula + " " + unidad2);
	}

}
