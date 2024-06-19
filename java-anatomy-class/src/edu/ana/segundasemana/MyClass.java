package edu.ana.segundasemana;
public class MyClass {
  // se for uma classe executável, o método main é obrigatório
  // void não retorna nada 
  public static void main (String [] args) {
    // classe em Java é um tipo de dado que pode ser instanciado em um objeto 
    // exemplo de classe: System, String, Integer, Double, Float, Long, Short, Byte, Character
    // exemplo de objeto: System.out, System.in, System.err

    long cep = 12345678;
    String formatarCep = formatarCep(cep);
    System.out.println(formatarCep);
  }

  // estrutura de um método:
  // modificador de acesso (public, private, protected, default)
  // tipo de retorno (void, int, String, double, float, long, short, byte, char, boolean)
  // nome do método (camelCase)
  // parâmetros (tipo nome, tipo nome, ...)
  // corpo do método
  // exemplos:

  int somar (int a, int b) {
    return a + b;
  }

  static String formatarCep (long cep) {
    return String.format("%05d-%03d", cep / 1000, cep % 1000);
  }

}
