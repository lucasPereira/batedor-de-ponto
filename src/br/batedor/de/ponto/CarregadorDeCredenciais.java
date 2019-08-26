package br.batedor.de.ponto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CarregadorDeCredenciais {

	public Credenciais carregar() {
		try {
			InputStream fluxo = new FileInputStream("credenciais.properties");
			Properties propriedades = new Properties();
			propriedades.load(fluxo);
			String usuario = propriedades.getProperty("usuario");
			String senha = propriedades.getProperty("senha");
			usuario.hashCode();
			senha.hashCode();
			return new Credenciais(usuario, senha);
		} catch (IOException excecao) {
			throw new ExcecaoCredenciaisNaoEncontradas();
		}

	}
}
