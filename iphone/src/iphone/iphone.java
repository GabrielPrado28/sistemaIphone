package iphone;

public class iphone implements ReprodutorMusical, NavegadorInternet,
AparelhoTelefonico {
	
	@Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

	public static void main(String[] args) {
		
		iphone meuIphone = new iphone();
		
		meuIphone.tocar();
		meuIphone.pausar();
		meuIphone.selecionarMusica("Bohemian Rapsody - Queen");
		meuIphone.ligar("123456789");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		meuIphone.exibirPagina("www.google.com");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
		
	}
	
}


