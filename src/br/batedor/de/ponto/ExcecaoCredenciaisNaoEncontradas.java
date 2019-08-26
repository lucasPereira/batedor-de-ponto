package br.batedor.de.ponto;

public class ExcecaoCredenciaisNaoEncontradas extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcecaoCredenciaisNaoEncontradas() {
		super("Não foi possível obter as credenciais. Certifique-se que o arquivo \"credenciais.properties\" exista e que as proprieraddes \"usuario\" e \"senha\" estejam definidas.");
	}
}
