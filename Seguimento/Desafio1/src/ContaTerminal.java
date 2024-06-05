import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);

       int Saldo = 237;
    
            System.out.println("Digite seu nome: ");
                String nome = ler.nextLine();
             
            System.out.println("Digite sua agencia: ");
                String ag = ler.nextLine();
           
            System.out.println("Digite o numero da sua conta: ");
                int Numero = ler.nextInt();

            System.out.println("Olá "+ nome+ " , obrigado por criar uma conta em nosso banco, sua agência é " + ag + " , conta "+ Numero +" e seu saldo " +Saldo + " já está disponível para saque.");

    }
}
