import java.util.Scanner;

public class VerificDireito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Verificação de Direitos ===");
        System.out.print("\nDigite o ano em que você nasceu: ");
        int anoNascimento = sc.nextInt();
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("--- RESULTADO ---");
        System.out.println("Sua idade é: " + idade + " anos.");

        if (idade >= 16) {
            System.out.println("Você já tem idade para VOTAR.");
        }
        
        if (idade >= 18) {
            System.out.println("Você já tem idade para DIRIGIR.");
        }

        if (idade < 16) {
            System.out.println("Você ainda não tem idade para votar nem para dirigir.");
        }

        sc.close();
    }
}