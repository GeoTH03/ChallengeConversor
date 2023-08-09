package Conversiones;

import UnidadesConversion.*;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Color;

public class VentanaActualizacion extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	JButton btnActualizar;
	DefaultTableModel modeloTabla = new DefaultTableModel();
	Object[] Moneda = new Object[10];
	private JMenuBar menuBar;
	private JButton btnActualizaDivi;
	private JButton btnActualizaUni;
	private JLabel lblAdvertencia;
	static int seleccionado;

	/**
	 * Launch the application.
	 */
	public static void CargaVentana(VentanaActualizacion frame) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaActualizacion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(475, 220, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 39, 375, 168);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);

		table.setBorder(UIManager.getBorder("ToolTip.border"));
		table.setBounds(24, 209, 375, 187);
		scrollPane.setViewportView(table);

		table.setModel(modeloTabla);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(this);
		btnActualizar.setBounds(310, 218, 89, 23);
		contentPane.add(btnActualizar);

		menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBounds(24, 0, 350, 22);
		contentPane.add(menuBar);

		btnActualizaDivi = new JButton("DIVISAS");
		btnActualizaDivi.setForeground(new Color(255, 255, 255));
		btnActualizaDivi.addActionListener(this);
		menuBar.add(btnActualizaDivi);

		btnActualizaUni = new JButton("Unidad Metrica");
		btnActualizaUni.setForeground(new Color(255, 255, 255));
		btnActualizaUni.addActionListener(this);
		menuBar.add(btnActualizaUni);

		lblAdvertencia = new JLabel("");
		lblAdvertencia.setBounds(34, 227, 255, 14);
		contentPane.add(lblAdvertencia);
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnActualizaDivi == e.getSource()) {
			cargaDatosDivisas();
			lblAdvertencia.setText("Actualiza el valor en base a un dolar");
			lblAdvertencia.setIcon(new ImageIcon("C:\\Users\\AUXILIAR\\eclipse-workspace\\ConversorChallenge\\src\\images\\advertencia.png"));
			this.seleccionado = 0;
		}

		if (btnActualizaUni == e.getSource()) {
			cargaDatosUnid();
			lblAdvertencia.setText("Agrega una nueva unidad y su valor en (Mts)");
			lblAdvertencia.setIcon(new ImageIcon("C:\\Users\\AUXILIAR\\eclipse-workspace\\ConversorChallenge\\src\\images\\advertencia.png"));
			this.seleccionado = 1;
		}
		if (btnActualizar == e.getSource()) {
			actualizaDatos();
		}
	}

	public void cargaDatosDivisas() {

		modeloTabla.setColumnIdentifiers(new Object[] { "DIVISA", "PRECIO" });

		Unidades obtiene = new Divisas();
		obtiene.unidadTipo = 0;
		obtiene.getUnidad();
		modeloTabla.setRowCount(0);

		int i = 0;
		for (Object m : obtiene.UnidaDiv[0]) {
			modeloTabla.addRow(new Object[] { m, obtiene.UnidaDiv[1][i] });
			i++;
		}
	}

	public void cargaDatosUnid() {

		modeloTabla.setColumnIdentifiers(new Object[] { "UNIDAD", "VALOR" });
		Unidades obtiene = new UnidadesMetricas();
		obtiene.unidadTipo = 1;
		obtiene.getUnidad();
		modeloTabla.setRowCount(0);

		
		int i = 0;

		for (Object m : obtiene.UnidaUnid[0]) {

			modeloTabla.addRow(new Object[] { m, obtiene.UnidaUnid[1][i] });
			i++;
		}

	}

	public void actualizaDatos() {
		switch (seleccionado) {
		case 0:
			Divisas manda = new Divisas();
			manda.unidadTipo = 0;
			for (int i = 0; i < table.getRowCount(); i++) {
				if (table.getValueAt(i, 0) != null) {
					manda.setUnidad((String) table.getValueAt(i, 0), (String) table.getValueAt(i, 1));
				}
			}
			manda.cadena = null;
			manda.fila = 0;
			break;
		case 1:
			UnidadesMetricas manda2 = new UnidadesMetricas();
			manda2.unidadTipo = 1;
			for (int i = 0; i < table.getRowCount(); i++) {
				if (table.getValueAt(i, 0) != null) {
					manda2.setUnidad((String) table.getValueAt(i, 0), (String) table.getValueAt(i, 1));
				}
			}
			manda2.cadena = null;
			manda2.fila = 0;
			break;
		}
	}
}
