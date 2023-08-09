package Conversiones;

import UnidadesConversion.*;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextArea;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class ConversorForm extends JFrame implements ActionListener {

	private JButton PanelPrincipal;
	JButton btnDivisas, btnInvertir, btnCopiar, btnConvertir, btnTemperatura, btnUnidadesM, btnActualizar;
	JLabel lblTitulo;
	JComboBox listaUnidades, listaUnidades2;
	JTextField txtValor, txtResultado;
	JTextArea txtOperacion;
	int opc;
	String guarda;
	public ConversorForm() throws UnsupportedLookAndFeelException {
		setResizable(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\AUXILIAR\\Downloads\\cms_files_10224_1671210503Prancheta_3.png"));
		setBackground(new Color(153, 153, 153));
		//JPanel PanelRedes = new JPanel();
		//PanelRedes.setEnabled(false);
		setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		setVisible(true);
		setTitle("CONVERSOR - ALURA CHALLENGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 715, 443);
		PanelPrincipal = new JButton();
		PanelPrincipal.setEnabled(false);
		PanelPrincipal.setIcon(new ImageIcon("C:\\Users\\AUXILIAR\\Downloads\\cms_files_10224_1671210503Prancheta_3.png"));
		PanelPrincipal.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 14));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);

		txtValor = new JTextField();
		txtValor.setFont(new Font("Montserrat", Font.PLAIN, 13));
		txtValor.setBackground(new Color(220, 220, 220));
		txtValor.setForeground(new Color(0, 0, 0));
		txtValor.setBounds(92, 167, 106, 29);

		PanelPrincipal.add(txtValor);

		listaUnidades = new JComboBox();
		listaUnidades.setForeground(new Color(255, 255, 255));
		listaUnidades.setBounds(204, 174, 116, 22);
		PanelPrincipal.add(listaUnidades);

		listaUnidades2 = new JComboBox();
		listaUnidades2.setForeground(new Color(255, 255, 255));
		listaUnidades2.setBounds(418, 174, 116, 22);
		PanelPrincipal.add(listaUnidades2);

		btnConvertir = new JButton("Convertir");
		btnConvertir.setForeground(new Color(255, 255, 255));
		btnConvertir.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 13));
		btnConvertir.setBounds(49, 219, 97, 30);
		btnConvertir.addActionListener(this);
		PanelPrincipal.add(btnConvertir);

		btnInvertir = new JButton("Invertir");
		btnInvertir.setIcon(null);
		btnInvertir.addActionListener(this);
		btnInvertir.setForeground(new Color(255, 255, 255));
		btnInvertir.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 13));
		btnInvertir.setBounds(315, 127, 97, 30);
		PanelPrincipal.add(btnInvertir);

		btnCopiar = new JButton("Copiar");
		btnCopiar.setForeground(new Color(255, 255, 255));
		btnCopiar.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 13));
		btnCopiar.setBounds(509, 219, 97, 30);
		PanelPrincipal.add(btnCopiar);

		JLabel label = new JLabel("Unidad de origen");
		label.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 14));

		label.setBounds(82, 127, 141, 22);
		PanelPrincipal.add(label);

		JLabel label_1 = new JLabel("Unidad de destino");
		label_1.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 15));
		label.setBackground(new Color(255, 255, 255));
		label_1.setBounds(481, 127, 154, 22);
		PanelPrincipal.add(label_1);

		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Montserrat", Font.PLAIN, 13));
		txtResultado.setBackground(new Color(192, 192, 192));
		txtResultado.setForeground(new Color(0, 0, 0));
		txtResultado.setBounds(540, 167, 106, 29);
		PanelPrincipal.add(txtResultado);

		btnDivisas = new JButton("Divisas");
		btnDivisas.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 13));
		btnDivisas.setForeground(new Color(255, 255, 255));
		btnDivisas.setBounds(10, 25, 120, 30);
		btnDivisas.addActionListener(this);
		PanelPrincipal.add(btnDivisas);

		btnTemperatura = new JButton("Temperatura");
		btnTemperatura.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 13));
		btnTemperatura.setForeground(new Color(255, 255, 255));
		btnTemperatura.setBounds(180, 25, 120, 30);
		btnTemperatura.addActionListener(this);
		PanelPrincipal.add(btnTemperatura);

		btnUnidadesM = new JButton("Unidades Metricas");
		btnUnidadesM.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 13));
		btnUnidadesM.setForeground(new Color(255, 255, 255));
		btnUnidadesM.setBounds(340, 25, 120, 30);
		btnUnidadesM.addActionListener(this);
		btnUnidadesM.setBorderPainted(true);
		PanelPrincipal.add(btnUnidadesM);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 13));
		btnActualizar.setBounds(520, 25, 120, 30);
		btnActualizar.setForeground(new Color(255, 255, 255));
		btnActualizar.addActionListener(this);
		PanelPrincipal.add(btnActualizar);

		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(new Rectangle(5, 5, 5, 5));
		verticalGlue.setBackground(SystemColor.desktop);
		verticalGlue.setBounds(88, 407, 2, 395);
		PanelPrincipal.add(verticalGlue);

		lblTitulo = new JLabel("");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 18));
		lblTitulo.setBounds(180, 59, 329, 38);
		PanelPrincipal.add(lblTitulo);

		txtOperacion = new JTextArea();
		txtOperacion.setWrapStyleWord(true);
		txtOperacion.setLineWrap(true);
		txtOperacion.setBounds(200, 203, 300, 80);

		PanelPrincipal.add(txtOperacion);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.guarda = (String) listaUnidades2.getSelectedItem();
		if (btnDivisas == e.getSource()) {
			this.opc = 0;
			lblTitulo.setText("Conversor de divisa");
			if (listaUnidades.getItemCount() > 0) {
				listaUnidades.removeAllItems();
				listaUnidades2.removeAllItems();
				txtValor.setText(null);
			}
			Unidades agregaLista = new Divisas();

			for (Object div : agregaLista.UnidaDiv[0]) {
				if (div != null) {
					listaUnidades.addItem(div);
					listaUnidades2.addItem(div);
				}
			}

		}
		if (btnTemperatura == e.getSource()) {
			this.opc = 1;

			lblTitulo.setText("Conversor de temperatura");
			if (listaUnidades.getItemCount() >= 0) {
				listaUnidades.removeAllItems();
				listaUnidades2.removeAllItems();
				txtValor.setText(null);
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
			
			lblTitulo.setText("Conversor de Unidades metricas");
			UnidadesMetricas unidades = new UnidadesMetricas();
			unidades.unidadTipo =1;
			unidades.getUnidad();
			if (listaUnidades.getItemCount() > 0) {
				listaUnidades.removeAllItems();
				listaUnidades2.removeAllItems();
				txtValor.setText(null);
			}

			if (listaUnidades.getSelectedItem() == null) {
				
				Unidades unidad = new UnidadesMetricas();
				for(Object agrega : unidad.UnidaUnid[0] ) {
					if (agrega != null) {
						listaUnidades.addItem(agrega);
						listaUnidades2.addItem(agrega);
					}
				}
				
			}
		}

		if (btnConvertir == e.getSource()) {
			double valor = Double.parseDouble(txtValor.getText());
			switch (opc) {
			case 0:
				Unidades operacion = new Divisas(listaUnidades.getSelectedItem().toString(), valor,
						listaUnidades2.getSelectedItem().toString());
				
				Conversor convertDiv = new Conversor(operacion);
				convertDiv.operacionConvertirDiv();

				txtOperacion.setText("Formula: "+convertDiv.getFormulaOp());
				txtResultado.setText(String.valueOf(convertDiv.getFormula()));
				break;
			case 1:
				Temperaturas temp = new Temperaturas(listaUnidades.getSelectedItem().toString(), valor,
						listaUnidades2.getSelectedItem().toString());
				Conversor convertTemp = new Conversor(temp);

				convertTemp.operacionConvertirTemp();
				txtOperacion.setText("Formula: "+convertTemp.getFormulaOp());
				txtResultado.setText(String.valueOf(convertTemp.getFormula()));

				break;
			case 2:
				UnidadesMetricas unidadM = new UnidadesMetricas(listaUnidades.getSelectedItem().toString(), valor,
						listaUnidades2.getSelectedItem().toString());
				Conversor convertU = new Conversor(unidadM);
				convertU.operacionConvertir();
				txtOperacion.setText("Formula: "+convertU.getFormulaOp());
				txtResultado.setText(String.valueOf(convertU.getFormula()));
				break;
			}

		}
		if (btnInvertir == e.getSource()) {
			listaUnidades2.setSelectedItem(listaUnidades.getSelectedItem());
			listaUnidades.setSelectedItem(guarda);
		}

		if (btnActualizar == e.getSource()) {
			VentanaActualizacion ventana = new VentanaActualizacion();
			ventana.setVisible(true);
		}
	}
}
