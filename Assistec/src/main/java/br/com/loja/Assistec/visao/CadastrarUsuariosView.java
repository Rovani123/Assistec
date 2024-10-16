package br.com.loja.Assistec.visao;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CadastrarUsuariosView extends JFrame {

	private static final long serialVersionUID = 1L;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarUsuariosView frame = new CadastrarUsuariosView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CadastrarUsuariosView() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}
