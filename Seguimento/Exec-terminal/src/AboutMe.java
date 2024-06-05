import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
            String nome = ler.nextLine();
        System.out.println("Digite seu sobrenome: ");
            String sobrenome = ler.nextLine();
        System.out.println("Digite sua idade: ");
            int idade = ler.nextInt();
        System.out.println("Digite sua altura: ");
            double altura = ler.nextDouble();

        System.out.println(" ");
        
        System.out.println("Ola me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Minha altura é: "+ altura + "cm");

        ler.close();
    }
}
