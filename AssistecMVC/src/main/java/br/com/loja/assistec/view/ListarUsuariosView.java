package br.com.loja.assistec.view;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;

import br.com.loja.assistec.model.Usuario;
import br.com.loja.assistec.model.UsuarioDAO;
import br.com.loja.assistec.model.UsuarioTableModel;

public class ListarUsuariosView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtLocalizar;
	private JTable tabela;
	private ArrayList<Usuario> usuariosList;
	private ListarUsuariosView listarUsusariosView;
	private UsuarioTableModel usuarioTableModel;
	private TableRowSorter<UsuarioTableModel> rowSorter;
	private JButton btnFechar;
	private JButton btnCadastrar;


	public ListarUsuariosView() {
//		this.listarUsusariosView = this;
		usuariosList = new ArrayList<>();
		
//		UsuarioController uc = new UsuarioController();
//		usuariosList = uc.listarUsuarios();
		
		setTitle("Listagem de usuários");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setActionCommand("btCadastrar");
//		btnCadastrar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				CadastrarUsuariosView cadUser = new CadastrarUsuariosView();
//				cadUser.setLocationRelativeTo(cadUser);
//				cadUser.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//				cadUser.setVisible(true);
//			}
//		});
		btnCadastrar.setBounds(10, 11, 117, 23);
		getContentPane().add(btnCadastrar);
		
		txtLocalizar = new JTextField();
		txtLocalizar.setBounds(139, 12, 252, 20);
		getContentPane().add(txtLocalizar);
		txtLocalizar.setColumns(10);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setActionCommand("btFechar");
		btnFechar.setBounds(189, 216, 89, 23);
		getContentPane().add(btnFechar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 57, 381, 148);
		getContentPane().add(scrollPane);
		
		usuarioTableModel = new UsuarioTableModel(usuariosList);
		tabela = new JTable();
		tabela.setModel(usuarioTableModel);
		scrollPane.setViewportView(tabela);
	}
	public void addListarUsuariosListener(ActionListener listener) {
		btnCadastrar.addActionListener(listener);
		btnFechar.addActionListener(listener);
	}
}