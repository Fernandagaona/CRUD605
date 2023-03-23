package prod12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class visitaproducto {

	private JFrame frmGestionDeProductos;
	private JTextField txtID;
	private JTextField txtDescripcion;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JTextField txtProveedor;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JButton btnActualizar;
	private JButton btnMostrar;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visitaproducto window = new visitaproducto();
					window.frmGestionDeProductos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public visitaproducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDeProductos = new JFrame();
		frmGestionDeProductos.setTitle("GESTION DE PRODUCTOS");
		frmGestionDeProductos.setBounds(100, 100, 450, 300);
		frmGestionDeProductos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDeProductos.getContentPane().setLayout(null);
		frmGestionDeProductos.setLocationRelativeTo(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(10, 11, 73, 14);
		frmGestionDeProductos.getContentPane().add(lblID);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setBounds(10, 36, 73, 14);
		frmGestionDeProductos.getContentPane().add(lblDescripcion);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setBounds(10, 61, 73, 14);
		frmGestionDeProductos.getContentPane().add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("CANTIDAD");
		lblCantidad.setBounds(10, 86, 73, 14);
		frmGestionDeProductos.getContentPane().add(lblCantidad);
		
		JLabel lblProveedor = new JLabel("PROVEEDOR");
		lblProveedor.setBounds(10, 111, 73, 14);
		frmGestionDeProductos.getContentPane().add(lblProveedor);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					producto np=new producto();
					np.setId(Integer.parseInt(txtID.getText()));
					np.setDescripcion(txtDescripcion.getText());
					np.setPrecio(Integer.parseDouble.getText());
					np.setCantidad(txtCantidad.getText());
					np.setProveedor(txtProveedor.getText());
				} catch () {
					
				}
				
			}
		});
		btnAgregar.setBounds(10, 161, 89, 23);
		frmGestionDeProductos.getContentPane().add(btnAgregar);
		
		txtID = new JTextField();
		txtID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtID.getText().length()>=11) {
					e.consume();
				}
			}
		});
		txtID.setBounds(112, 8, 86, 20);
		frmGestionDeProductos.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtDescripcion.getText().length()>=100) {
					e.consume();
				}
			}
		});
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(112, 33, 86, 20);
		frmGestionDeProductos.getContentPane().add(txtDescripcion);
		
		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtPrecio.getText().length()>=10.0) {
					e.consume();
				}
			}
		});
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(112, 58, 86, 20);
		frmGestionDeProductos.getContentPane().add(txtPrecio);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtCantidad.getText().length()>=3) {
					e.consume();
				}
			}
		});
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(112, 83, 86, 20);
		frmGestionDeProductos.getContentPane().add(txtCantidad);
		
		txtProveedor = new JTextField();
		txtProveedor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtProveedor.getText().length()>=100) {
					e.consume(); 
				}
			}
		});
		txtProveedor.setColumns(10);
		txtProveedor.setBounds(112, 108, 86, 20);
		frmGestionDeProductos.getContentPane().add(txtProveedor);
		btnAgregar = new JButton("Agregar");
	
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(109, 161, 89, 23);
		frmGestionDeProductos.getContentPane().add(btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(208, 161, 89, 23);
		frmGestionDeProductos.getContentPane().add(btnActualizar);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(320, 161, 89, 23);
		frmGestionDeProductos.getContentPane().add(btnMostrar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(147, 195, 89, 23);
		frmGestionDeProductos.getContentPane().add(btnBorrar);
	}
}
