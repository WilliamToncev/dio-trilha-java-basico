import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Por favor, Digite o número da conta: ");
        String conta = scanner.nextLine();
        scanner.nextLine();
    
        System.out.println("Por favor, Digite o número da Agencia: ");
        String agencia = scanner.nextLine();    

        System.out.println("Por favor, Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, Digite o saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá,  " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " e sua conta é " + conta + 
            " e o seu saldo de" + saldo + " já está disponível para saque.");
    }
}
