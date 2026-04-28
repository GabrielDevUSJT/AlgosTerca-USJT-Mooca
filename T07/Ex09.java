import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (A): ");
        double A = sc.nextDouble();

        System.out.print("Digite o expoente (B, inteiro positivo): ");
        int B = sc.nextInt();

        double resultado = 1;

        for (int i = 1; i <= B; i++) {
            resultado *= A;
            System.out.println("i=" + i + " → resultado = " + resultado);
        }

        System.out.printf("%nResultado: %.0f^%d = %.0f%n", A, B, resultado);

        sc.close();
    }
}