public class Operadores {
 public static void main(String[] args) {
  String concatenacao = "?";
  concatenacao = 1+1+1+"1";
  System.out.println(concatenacao); // 31
  concatenacao = 1+"1"+1+"1";
  System.out.println(concatenacao); // 1111
  concatenacao = "1"+1+1+1;
  System.out.println(concatenacao); // 1111
  concatenacao = "1"+(1+1+1);
  System.out.println(concatenacao); // 13

  int numero = 5;
  System.out.println(- numero); // -5
  System.out.println(numero); // 5

  numero = - numero;
  System.out.println(numero); // -5

  numero = + numero;
  System.out.println(numero); // -5

  numero = - numero;
  System.out.println(numero); // 5
  
  numero++;
  System.out.println(numero); // 6

  System.out.println(numero++); // 6
  System.out.println(numero); // 7
  System.out.println(++numero); // 8

  boolean variavel = true;
  System.out.println(!variavel); // false
  System.out.println(variavel); // true

  variavel = !variavel;

  System.out.println(variavel); // false

  int a, b;
  a = 5;
  b = 10;

  boolean resultado = a == b;
  System.out.println(resultado); // false
 } 
}
