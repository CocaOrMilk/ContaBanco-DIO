import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double Saldo = 237.48;
        String NomeCliente;
        String Agencia;

        System.out.println("Por favor, digite seu nome");

        while (true) {
            NomeCliente = scanner.nextLine();

            // Comparar string.
            if (NomeCliente.equals("Mario Andrade")) {
                break;
            } else {
                System.out.println("Nome não reconhecido. Tente novamente.");
            }
        }

        System.out.println("Por favor, digite o número da Agência");

        while (true) {
            Agencia = scanner.nextLine();

            // Comparar string.
            if (Agencia.equals("067-8")) {
                break;
            } else {
                System.out.println("Agencia não reconhecida. Tente novamente.");
            }
        }

        System.out.println("Por favor, digite o número da Conta");

        int Numero;
        while (true) {
            Numero = scanner.nextInt();

            // Comparar Int
            if (Numero == 1021) {
                break;
            } else {
                System.out.println("Conta não reconhecida. Tente novamente.");
            }
        }

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");

    }
}