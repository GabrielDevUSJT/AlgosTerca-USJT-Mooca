
import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculador de IMC ===");
        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        
        System.out.println("seu IMC é: " + imc);
        sc.close();
    }
}
