package application;

public interface AparelhoTelefonico {

	void ligar(String numeroTelefone);

	void atender();

	void iniciarCorreioVoz(String numeroTelefone, String mensagem);
}
