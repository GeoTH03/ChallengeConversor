
public class TestConversorDeMonedas {

	public static void main(String[] args) {

		Divisas divisa = new Divisas("USD", 10, "LIBRA ESTERLINAS");

		Conversor operar = new Conversor(divisa);

		divisa.getUnidad();
		operar.operacionConvertirDiv();
		
		}

	}


