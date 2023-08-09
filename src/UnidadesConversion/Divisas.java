package UnidadesConversion;

public class Divisas extends Unidades {

	public static String[][] Monedas = new String[2][20];
	public static int fila;
	public String rutaArchivo = "C:\\Users\\AUXILIAR\\Desktop\\Prueba.text"; // Ruta del archivo a crear
	public static String listaDivisas;

	public Divisas() {
		getUnidad();
	}

	public Divisas(String tipo, double valor, String tipoAconvertir) {
		super(tipo, valor, tipoAconvertir);

	}

	public void setUnidad(String nombre, String valor) {
		super.setUnidad(nombre, valor);
	}

	public void getUnidad() {
		super.getUnidad();

	}

}
