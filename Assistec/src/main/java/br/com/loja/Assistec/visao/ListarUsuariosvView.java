package br.com.loja.Assistec.visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarUsuariosvView extends JFrame {
	private JTextField txtLocalizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarUsuariosvView frame = new ListarUsuariosvView();
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
	public ListarUsuariosvView() {
		setTitle("Listagem de Usuários");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btcCdastrar = new JButton("Cadastrar");
		btcCdastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarUsuariosView cuv = new CadastrarUsuariosView();
				cuv.setLocationRelativeTo(cuv);
				cuv.setVisible(true);
			}
		});
		btcCdastrar.setBounds(10, 11, 81, 23);
		getContentPane().add(btcCdastrar);
		
		txtLocalizar = new JTextField();
		txtLocalizar.setBounds(118, 12, 86, 20);
		getContentPane().add(txtLocalizar);
		txtLocalizar.setColumns(10);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btSair.setBounds(345, 227, 89, 23);
		getContentPane().add(btSair);

	}
}
