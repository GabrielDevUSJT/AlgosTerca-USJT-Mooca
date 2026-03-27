
import java.util.Scanner;

public class ArmzDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SEUS DADOS ===");
        System.out.println("digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("digite a sua altura: ");
        double altura = sc.nextDouble();
       
        System.out.println("\n=== RESULTADO ===");
        System.out.println("olá " + nome + " você tem " + idade + " anos e a sua altura é " + altura);
        sc.close();
    }
}
