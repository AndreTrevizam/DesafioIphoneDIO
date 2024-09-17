package desafio.navegadorInternet;

public class IphoneNavegadorInternet implements NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página... " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicinando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
