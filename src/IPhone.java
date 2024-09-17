import desafio.aparelhoTelefonico.AparelhoTelefonico;
import desafio.aparelhoTelefonico.IPhoneTelefone;
import desafio.navegadorInternet.IphoneNavegadorInternet;
import desafio.navegadorInternet.NavegadorInternet;
import desafio.reprodutorMusical.IphoneReprodutorMusical;
import desafio.reprodutorMusical.ReprodutorMusical;

public class IPhone {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new IPhoneTelefone();
        NavegadorInternet navegador = new IphoneNavegadorInternet();
        ReprodutorMusical reprodutorMusical = new IphoneReprodutorMusical();

        telefone.ligar();
        navegador.exibirPagina("youtube.com");
        reprodutorMusical.tocar();
    }
}