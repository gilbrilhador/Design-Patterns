package pattern.domain;

public class Twitter extends RedeSocial {

	public Twitter(String login, String senha) {
		super(login, senha);
	}
	
	@Override
	boolean login(String login, String senha) {
		System.out.println("Autenticando usu�rio...");
		System.out.println("Login: " + login);
		System.out.print("Senha: ");
		for (int i = 0; i < senha.length(); i++) {
			System.out.print("*");
		}
		System.out.println("\nLogin efetuado com sucesso no Twitter!");
		return true;
	}

	@Override
	boolean enviarDados(byte[] dados) {
		boolean postado = true;
		if (postado) {
			System.out.println("Mensagem '" + new String(dados) + "' foi postada no Twitter!");
			return true;
		} else {
			return false;
		}
	}

	@Override
	void logout() {
		System.out.println("Login '" + login + "' foi desconectado do Twitter!\n\n");
	}
}
