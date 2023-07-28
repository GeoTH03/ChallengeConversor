package Conversiones;

import UnidadesConversion.*;
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

import com.formdev.flatlaf.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
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
import java.awt.Dialog.ModalExclusionType;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class ConversorForm extends JFrame implements ActionListener {

	private JPanel PanelPrincipal;
	Button btnDivisas, btnInvertir, btnCopiar, btnConvertir, btnTemperatura, btnUnidadesM;
	JLabel lblTitulo;
	JComboBox listaUnidades, listaUnidades2;
	TextField txtValor, txtResultado;
	JTextArea txtOperacion;
	int opc;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ConversorForm() throws UnsupportedLookAndFeelException {

		setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		setVisible(true);
		setTitle("CONVERSOR - ALURA CHALLENGE");
		// setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 443);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		// PanelPrincipal.setBackground(new Color(255, 255, 255));
		PanelPrincipal.setBorder(UIManager.getBorder("Button.border"));

		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);

		listaUnidades = new JComboBox();
		listaUnidades.setBounds(244, 174, 97, 22);
		PanelPrincipal.add(listaUnidades);

		listaUnidades2 = new JComboBox();
		listaUnidades2.setBounds(487, 174, 97, 22);
		PanelPrincipal.add(listaUnidades2);

		btnConvertir = new Button("Convertir");
		btnConvertir.setBounds(new Rectangle(20, 2, 2, 20));
		btnConvertir.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
		btnConvertir.setBounds(159, 219, 97, 30);
		btnConvertir.setBackground(new Color(8, 207, 220));
		btnConvertir.addActionListener(this);
		PanelPrincipal.add(btnConvertir);

		btnInvertir = new Button("Invertir");
		btnInvertir.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
		btnInvertir.setBounds(355, 127, 97, 30);
		btnInvertir.setBackground(new Color(8, 207, 220));
		btnInvertir.addActionListener(this);
		PanelPrincipal.add(btnInvertir);

		btnCopiar = new Button("Copiar");
		btnCopiar.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
		btnCopiar.setBounds(559, 219, 97, 30);
		btnCopiar.setBackground(new Color(8, 207, 220));
		btnCopiar.addActionListener(this);
		PanelPrincipal.add(btnCopiar);

		Label label = new Label("Unidad de origen");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));

		label.setBounds(132, 127, 141, 22);
		PanelPrincipal.add(label);

		Label label_1 = new Label("Unidad de destino");
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		label.setBackground(null);
		label_1.setBounds(531, 127, 154, 22);
		PanelPrincipal.add(label_1);

		txtResultado = new TextField();
		txtResultado.setForeground(new Color(153, 153, 153));
		txtResultado.setBounds(590, 167, 106, 29);
		PanelPrincipal.add(txtResultado);

		txtValor = new TextField();
		txtValor.setForeground(new Color(102, 102, 102));
		txtValor.setBounds(132, 167, 106, 29);

		PanelPrincipal.add(txtValor);

		btnDivisas = new Button("Divisas");
		btnDivisas.setBounds(10, 25, 116, 22);
		btnDivisas.addActionListener(this);
		PanelPrincipal.add(btnDivisas);

		btnTemperatura = new Button("Temperatura");
		btnTemperatura.setBounds(10, 71, 116, 22);
		btnTemperatura.addActionListener(this);
		PanelPrincipal.add(btnTemperatura);

		btnUnidadesM = new Button("Unidades Metricas");
		btnUnidadesM.addActionListener(this);
		btnUnidadesM.setBounds(10, 111, 116, 22);
		PanelPrincipal.add(btnUnidadesM);

		Button button_1_1_1 = new Button("New button");
		button_1_1_1.setBounds(29, 192, 70, 22);
		PanelPrincipal.add(button_1_1_1);

		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(new Rectangle(5, 5, 5, 5));
		verticalGlue.setBackground(SystemColor.desktop);
		verticalGlue.setBounds(108, 407, 2, -395);
		PanelPrincipal.add(verticalGlue);

		lblTitulo = new JLabel("");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTitulo.setBounds(266, 39, 249, 38);
		PanelPrincipal.add(lblTitulo);

		txtOperacion = new JTextArea();
		txtOperacion.setBackground(new Color(204, 255, 255));
		txtOperacion.setMargin(new Insets(27, 40, 50, 40));
		txtOperacion.setLineWrap(true);
		txtOperacion.setAutoscrolls(false);
		txtOperacion.setBounds(281, 203, 234, 80);

		PanelPrincipal.add(txtOperacion);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (btnDivisas == e.getSource()) {
			this.opc = 0;
			lblTitulo.setText("Conversor de divisa");
			if (listaUnidades.getItemCount() > 0) {
				listaUnidades.removeAllItems();
				listaUnidades2.removeAllItems();
				txtValor.setText(null);
			}
			Divisas agregaLista = new Divisas();

			for (int i = 0; i <= agregaLista.Monedas[0].length; i++) {
				if (agregaLista.Monedas[0][i] != null && agregaLista.Monedas[0][i] != listaUnidades.getItemAt(i)) {
					listaUnidades.addItem(agregaLista.Monedas[0][i]);
					listaUnidades2.addItem(agregaLista.Monedas[0][i]);
				}
			}
		}
		if (btnTemperatura == e.getSource()) {
			this.opc = 1;

			lblTitulo.setText("Conversor de temperatura");
			if (listaUnidades.getItemCount() >= 0) {
				listaUnidades.removeAllItems();
				listaUnidades2.removeAllItems();
			}
			if (listaUnidades.getSelectedItem() == null) {
				listaUnidades.addItem("Grados Celsius");
				listaUnidades2.addItem("Grados Celsius");
				listaUnidades.addItem("Grados FharenHeit");
				listaUnidades2.addItem("Grados FharenHeit");
				listaUnidades.addItem("Grados Kelvin");
				listaUnidades2.addItem("Grados Kelvin");

			}
		}

		if (btnUnidadesM == e.getSource()) {
			this.opc = 2;
			UnidadesMetricas unidades = new UnidadesMetricas();
			if(listaUnidades.getItemCount()<=0) {
			unidades.setTipoUnidades();
			}
			if (listaUnidades.getItemCount() >0) {
				listaUnidades.removeAllItems();
				listaUnidades2.removeAllItems();
			}

		
			if (listaUnidades.getSelectedItem() == null) {
				
					for (int i = 0; i < unidades.tiposUnidades.size(); i++) {
					listaUnidades.addItem(unidades.tiposUnidades.get(i));
					listaUnidades2.addItem(unidades.tiposUnidades.get(i));
				}
					
			}
		}

		if (btnConvertir == e.getSource()) {
			double valor = Double.parseDouble(txtValor.getText());

			switch (opc) {
			case 0:
				Divisas operacion = new Divisas(listaUnidades.getSelectedItem().toString(), valor,
						listaUnidades2.getSelectedItem().toString());
				Conversor convertDiv = new Conversor(operacion);
				convertDiv.operacionConvertirDiv();

				txtOperacion.setText(convertDiv.getFormulaOp());
				txtResultado.setText(String.valueOf(convertDiv.getFormula()));
				break;
			case 1:
				Temperaturas temp = new Temperaturas(listaUnidades.getSelectedItem().toString(), valor,
						listaUnidades2.getSelectedItem().toString());
				Conversor convertTemp = new Conversor(temp);

				convertTemp.operacionConvertirTemp();
				txtOperacion.setText(convertTemp.getFormulaOp());
				txtResultado.setText(String.valueOf(convertTemp.getFormula()));

				break;
			}

		}

	}
}