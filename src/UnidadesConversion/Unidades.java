package UnidadesConversion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;
/**
 * Clase padre de Unidades
 * Lectura y creación de la lista de unidades con su valor correspondiente
 * 
 * @version 1.0
 * @author Geovanny Torres Hernandez
 *
 */
public class Unidades {
	public static Object[][] UnidaDiv = new Object[2][20];
	public static Object[][] UnidaUnid = new Object[2][20];
	static String directorioRaiz = System.getProperty("user.dir");
	static String nombreArchivoDivisas = directorioRaiz +"\\listas\\Divisas.text"; // Ruta del archivo a crear
	static String nombreArchivoUnidades = directorioRaiz +"\\listas\\Unidades.text"; // Ruta del archivo a crear

	public Unidades() {
		getUnidad();
	}

	public Unidades(String tipo, double valor, String tipoAconvertir) {
		this.tipo = tipo;
		this.valor = valor;
		this.tipoAconvertir = tipoAconvertir;
	}

	private String tipo;
	private double valor;
	private String tipoAconvertir;
	public String cadena;
	public static int unidadTipo;
	public static int fila;
	public static String[] nombre;

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

	public String getTipoAconvertir() {
		return tipoAconvertir;
	}
	/*
	  */
	public void getUnidad() {
		try {
			switch (unidadTipo) {
			case 0:
				leerArchivoTexto(nombreArchivoDivisas);// Función lectura de archivo, parametro: ruta del archivo;
				break;
			case 1:
				leerArchivoTexto(nombreArchivoUnidades);
				break;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void leerArchivoTexto(String rutaArchivo) throws FileNotFoundException {// Aqui lee el archivo
		int i = 0;// variable de conteo;
		try {
			File archivo = new File(rutaArchivo);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));// Objeto de lectura.
			String linea;
			switch (unidadTipo) {
			case 0:
				while ((linea = reader.readLine()) != null) {// Lectura

					UnidaDiv[0][i] = linea.substring(0, 3);
					UnidaDiv[1][i] = linea.substring(4);

					i++;
				}
				break;
			case 1:

				while ((linea = reader.readLine()) != null) {// Lectura
					
					UnidaUnid[0][i] = linea.replaceAll("[^A-z]", "");
					UnidaUnid[1][i] = linea.replaceAll("[^0-9.]", "");

					i++;
				}
				break;
			}
			reader.close();
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}
		
	}

	public void setUnidad(String nombre, String valor) {
		switch (unidadTipo) {
		case 0:
			Unidades.UnidaDiv[0][fila] = nombre;
			Unidades.UnidaDiv[1][fila] = valor;

			String contenido = (String) UnidaDiv[0][fila] + "," + (String) UnidaDiv[1][fila] + "\n";

			if (cadena == null) {
				this.cadena = contenido;
			} else {
				cadena += contenido;// Agrega cadenas al string "listaDivisas"
			}
			break;
		case 1:
			Unidades.UnidaUnid[0][fila] = nombre;
			Unidades.UnidaUnid[1][fila] = valor;

			String contenido2 = (String) UnidaUnid[0][fila] + "," + (String) UnidaUnid[1][fila] + "\n";

			if (cadena == null) {
				this.cadena = contenido2;
			} else {
				cadena += contenido2;// Agrega cadenas al string "listaDivisas"
			}
			break;
		}

		switch (unidadTipo) {
		case 0:
			crearArchivoTexto(cadena, nombreArchivoDivisas);
			break;
		case 1:
			crearArchivoTexto(cadena, nombreArchivoUnidades);
			break;
		}
		// funcion crear archivo, parametros: Contenido y ruta de creación.
		fila++;// incrementa de uno en uno

	}

	public static void crearArchivoTexto(String contenido, String rutaArchivo) {// Aqui se crea el archivo.
		File archivo = new File(rutaArchivo);// Objeto archivo
		try {
			if (!archivo.exists()) {// Condicion, si no existe se crea un nuevo archivo;
				archivo.createNewFile();
			} else {// Si existe
				archivo.delete();// elimina el archivo existente
				BufferedWriter escribe = new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));// crea un nuevo archivo
				escribe.write(contenido);// escribe en el nuevo archivo.
				escribe.close();// cierra el archivo.
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
}
