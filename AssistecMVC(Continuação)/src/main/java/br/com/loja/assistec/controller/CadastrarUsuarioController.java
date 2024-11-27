package br.com.loja.assistec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.loja.assistec.model.Usuario;
import br.com.loja.assistec.view.CadastrarUsuariosView;

public class CadastrarUsuarioController {
	private CadastrarUsuariosView cadastrarView;
	private ListarUsuarioController listarController;
	private Usuario usuarioSelecionado;
	
	public CadastrarUsuarioController(ListarUsuarioController listarUsuarioController, Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
		this.listarController = listarUsuarioController;
		cadastrarView = new CadastrarUsuariosView(usuarioSelecionado);
		cadastrarView.setLocationRelativeTo(null);
		cadastrarView.setVisible(true);
		configurarListeners();
	}

	private void configurarListeners() {
		cadastrarView.addCadastrarUsuariosListeners(new CadastrarUsuariosListeners());
		
	}
	
	private class CadastrarUsuariosListeners implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "btnIncluir": 
//				metodoAlterarIncluir();
				break;
			case "btnExcluir":
//				metodoExcluir();
				break;
			case "btnFechar":
				cadastrarView.dispose();
				break;			
			}
		}
		
	}

}
