import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("\n=== Verificação Positivo x Negativo ===");
        System.out.print("\nDigite um número: ");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("O número é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("O número é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO (neutro).");
        }

        sc.close();
    }
}