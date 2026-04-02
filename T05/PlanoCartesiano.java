import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Plano Cartesiano ===");
        System.out.print("\nDigite X e Y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante I");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante II");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante III");
        } else {
            System.out.println("Quadrante IV");
        }

        sc.close();
    }
}