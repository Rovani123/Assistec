package br.com.loja.Assistec.controle;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.loja.Assistec.modelo.Usuario;
import br.com.loja.Assistec.modelo.UsuarioDAO;

public class UsuarioControle {
	
	public UsuarioControle() {
	}
	
	public  ArrayList<Usuario> listarUsuarios() throws SQLException {
		UsuarioDAO dao = new UsuarioDAO();
		return dao.selecionarUsuarios();
	}

}