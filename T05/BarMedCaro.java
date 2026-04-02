import java.util.Scanner;

public class BarMedCaro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Verificação Barato x Medio x Caro ===");
        System.out.print("\nDigite um número: ");
        double numero = sc.nextDouble();

        if (numero <= 50) {
            System.out.println("Barato.");
        } else if (numero <=100) {
            System.out.println("Medio.");
        } else if (numero > 101) {
            System.out.println("Caro.");
        } else {
            System.out.println("Valor inválido.");
        }
        sc.close();
    }
}