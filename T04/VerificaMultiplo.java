import java.util.Scanner;

public class VerificaMultiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Verificação Multipla ===");
        System.out.print("\nInforme um número: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 3 e 5 ao mesmo tempo.");
        } else {
            System.out.println("O número " + numero + " NÃO atende a ambas as condições.");
        }

        sc.close();
    }
}