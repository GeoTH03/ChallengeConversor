package Conversiones;

import javax.swing.JFrame;
import UnidadesConversion.*;
import com.formdev.flatlaf.*;
import java.awt.EventQueue;

import javax.swing.border.BevelBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.TextComponent;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.Box;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JToggleButton;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import com.formdev.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.border.TitledBorder;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import com.formdev.flatlaf.intellijthemes.*;
public class Principal {
	public static int ventana;
	public static void main(String[] args) throws UnsupportedLookAndFeelException{
		FlatLightLaf.setup();
		int valor;
		
		//TextArea
		  UIManager.setLookAndFeel(new FlatGradiantoDeepOceanIJTheme());
		  UIManager.put("JTextArea.arc",100); 		  
		  UIManager.put( "Component.arrowType", "chevron" );
		 
		ConversorForm nuevo = new ConversorForm();
		SwingUtilities.updateComponentTreeUI(nuevo);
		
		nuevo.setVisible(true);
		
		valor = recibe(ventana);
		
		if(valor == 1) {
			VentanaActualizacion window = new VentanaActualizacion();
			window.CargaVentana(window);
		}
		
	}
	
	public static int recibe(int valor) {
		return valor;
	}
}
