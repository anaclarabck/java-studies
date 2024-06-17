public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();
    System.out.println("A TV está ligada? " + smartTv.ligada);
    System.out.println("Canal: " + smartTv.canal);
    System.out.println("Volume: " + smartTv.volume);
    
    smartTv.ligar();
    System.out.println("A TV está ligada? " + smartTv.ligada);

    smartTv.aumentarVolume();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();

    smartTv.mudarCanal(5);
  }
}