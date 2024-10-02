package br.com.loja.Assistec.controle;

import java.sql.SQLException;

import br.com.loja.Assistec.modelo.LoginDAO;
import br.com.loja.Assistec.modelo.Usuario;

public class LoginController{
	
	private Usuario model;

	public LoginController() 
	{

	}

	public void logar() {
			
	}
	public boolean verificarBancoOnline() throws SQLException
	{
		LoginDAO ldao = new LoginDAO();
		return ldao.bancoOnline();
	}

}
