import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.next();

            
            scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da Conta:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal para o saldo:");
                scanner.next(); 
            }
            double saldo = scanner.nextDouble();

            
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                              + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
            System.out.println(mensagem);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler os dados. Por favor, tente novamente.");
        } finally {
            
            scanner.close();
        }
    }
}
