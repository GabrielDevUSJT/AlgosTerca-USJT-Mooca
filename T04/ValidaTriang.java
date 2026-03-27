import java.util.Scanner;

public class ValidaTriang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Verificador de Triângulo ===");
        System.out.print("\nDigite o valor do lado A: ");
        double a = sc.nextDouble();
        
        System.out.print("Digite o valor do lado B: ");
        double b = sc.nextDouble();
        
        System.out.print("Digite o valor do lado C: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os valores FORMAM um triângulo.");
        } else {
            System.out.println("Os valores NÃO PODEM formar um triângulo.");
        }

        sc.close();
    }
}