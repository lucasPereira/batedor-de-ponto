package br.batedor.de.ponto;

import java.util.function.BiConsumer;

public class Credenciais {

	private String usuario;
	private String senha;

	public Credenciais(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public void aplicar(BiConsumer<String, String> funcao) {
		funcao.accept(usuario, senha);
	}

}
