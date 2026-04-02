import java.util.Scanner;

public class OrdemDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Ordenação de Números ===");
        System.out.print("\nDigite o primeiro número (A): ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número (B): ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro número (C): ");
        int c = sc.nextInt();

        int aux; 

        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (a < c) {
            aux = a;
            a = c;
            c = aux;
        }

        if (b < c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println("\n--- ORDEM DECRESCENTE ---");
        System.out.println(a + " - " + b + " - " + c);

        sc.close();
    }
}