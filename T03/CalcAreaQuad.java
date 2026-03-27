import java.util.Scanner;

public class CalcAreaQuad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Calcular Área do Quadrado ===");
        System.out.print("\nDigite a medida do lado do quadrado: ");
        
        double lado = sc.nextDouble();
        double area = lado * lado;

        System.out.println("A área do quadrado com lado " + lado + " é: " + area);

        sc.close();
    }
}