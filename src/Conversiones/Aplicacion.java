package Conversiones;

import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Aplicacion {

	public Aplicacion() {
		
	}
	public void agregaDatos() {
		try {
		ConversorForm nuevo = new ConversorForm();
		nuevo.setVisible(true);
		}catch(UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(null, e.fillInStackTrace());
		}
	}
	
	
}
