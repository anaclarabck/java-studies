package aparelho.iphone;

import recursos.internet.NavegadorInternet;
import recursos.musica.ReprodutorMusical;
import recursos.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando música: " + musica);
  }
  public void tocar() {
    System.out.println("Tocando música");
  }
  public void pausar() {
    System.out.println("Pausando música");
  }

  public void ligar(String numero) {
    System.out.println("Ligando para: " + numero);
  }
  public void atender() {
    System.out.println("Atendendo chamada");
  }
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }
  
  public void exibirPagina(String exemplo) {
    System.out.println("Exibindo página: " + exemplo);
  }
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }
  public void atualizarPagina() {
    System.out.println("Atualizando página"); 
  }
}
