import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Locadora {

	private JFrame frame;
	private JTextField txtCdigo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Locadora window = new Locadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Locadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.setEnabled(false);
		frame.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.setBounds(100, 100, 719, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tpLocadora = new JTabbedPane(JTabbedPane.TOP);
		tpLocadora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tpLocadora.setBounds(10, 23, 683, 358);
		frame.getContentPane().add(tpLocadora);
		
		JPanel p1 = new JPanel();
		tpLocadora.addTab("p1", null, p1, null);
		p1.setLayout(null);
		
		txtCdigo = new JTextField();
		txtCdigo.setText("C\u00F3digo");
		txtCdigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCdigo.setBounds(22, 29, 86, 20);
		p1.add(txtCdigo);
		txtCdigo.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(78, 69, 212, 20);
		p1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNomep1 = new JLabel("Nome");
		lblNomep1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomep1.setBounds(22, 72, 46, 14);
		p1.add(lblNomep1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(22, 113, 46, 14);
		p1.add(lblNewLabel);
		
		JPanel p2 = new JPanel();
		tpLocadora.addTab("p2", null, p2, null);
		p2.setLayout(null);
		
		JPanel p3 = new JPanel();
		tpLocadora.addTab("p3", null, p3, null);
		p3.setLayout(null);
	}
}
