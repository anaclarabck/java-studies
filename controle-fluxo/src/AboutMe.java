import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Qual é o seu nome?");
       String nome = scanner.next();

       System.out.println("Qual sua idade?");
       int idade = scanner.nextInt();

       System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

    }
    catch (InputMismatchException e) {
         System.err.println("Idade deve ser um número inteiro.");
    }
}
