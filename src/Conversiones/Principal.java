package Conversiones;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicMenuItemUI;
import javax.swing.SwingUtilities;
import com.formdev.flatlaf.intellijthemes.*;
import java.awt.Component;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;

public class Principal {
	public static int ventana;

	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		FlatLightLaf.setup();
		int valor;

		UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
		UIManager.put("Component.JTextArea.arc", 100);
		UIManager.put("Component.arc", 100);
		UIManager.put("Component.arrowType", "chevron");

		ConversorForm nuevo = new ConversorForm();
		SwingUtilities.updateComponentTreeUI(nuevo);

		nuevo.setVisible(true);

		valor = recibe(ventana);

		if (valor == 1) {
			VentanaActualizacion window = new VentanaActualizacion();
			window.CargaVentana(window);
		}

	}

	public static int recibe(int valor) {
		return valor;
	}
}
