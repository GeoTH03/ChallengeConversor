package Conversiones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;

public class ActualizarUnidades {

	JFrame frame;
	public static JTable table;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnActualizar;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { ActualizarUnidades window = new
	 * ActualizarUnidades(); window.frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the application.
	 */
	public ActualizarUnidades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setForeground(new Color(255, 255, 255));
		table.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new LineBorder(new Color(0, 0, 0))));
		table.setToolTipText("");
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"MXN", new Double(17.38), null, null, null, null},
				{"USD", null, null, null, null, null},
				{"COP", null, null, null, null, null},
				{"YUAN", null, null, null, null, null},
				{"YEN", null, null, null, null, null},
				{"WON", null, null, null, null, null},
				{"LIBRA ESTERLINA", null, null, null, null, null},
				{"EUR", null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"DIVISA", "VALOR", "New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Double.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(108);
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.getColumnName(0).getBytes();
		table.setBounds(12, 35, 410, 193);
		frame.getContentPane().add(table);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 410, 23);
		frame.getContentPane().add(menuBar);
		
		JButton btnNewButton = new JButton("New button");
		menuBar.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		menuBar.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(btnNewButton_2);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(324, 228, 98, 21);
		frame.getContentPane().add(btnActualizar);
	}
}
