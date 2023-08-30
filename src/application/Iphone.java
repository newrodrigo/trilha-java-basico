package application;

public class Iphone implements ReprodutorMusical, Navegador, AparelhoTelefonico {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();

		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		System.out.println();

		iphone.ligar("+557199990-9999");
		iphone.atender();
		iphone.iniciarCorreioVoz("+55(71)99123-4567", "Olá");
		System.out.println();

		iphone.exibirPagina("https://www.google.com.br");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}

	@Override
	public void ligar(String numeroTelefone) {
		System.out.println("Ligando para " + numeroTelefone);

	}

	@Override
	public void atender() {
		System.out.println("Ligação atendida");

	}

	@Override
	public void iniciarCorreioVoz(String numeroTelefone, String mensagem) {
		System.out.println("O contato: " + numeroTelefone + " Deixou a mensagem: " + mensagem);

	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página " + url);

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba carregada");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");

	}

	@Override
	public void tocar() {
		System.out.println("Iniciando Música");

	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Música selecionada");

	}

}
