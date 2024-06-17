import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da conta (apenas números): ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta (utilizando ponto para decimal): ");
        float saldo = scanner.nextFloat();

        scanner.close();

        String resultado = "Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(resultado);
    }
}
