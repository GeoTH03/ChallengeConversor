package UnidadesConversion;

import java.io.BufferedReader;
//import Conversiones.ActualizarUnidades;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.io.IOException;

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
