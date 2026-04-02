import java.util.Scanner;

public class CalcIMCOMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Calculador de IMC ===");
        System.out.print("\nDigite a sua altura (ex: 1,75): ");
        double altura = sc.nextDouble();
        System.out.print("Digite o seu peso (ex: 70): ");
        double peso = sc.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        
        System.out.printf("\nSeu IMC é: %.2f\n", imc);
        System.out.print("Classificação: ");

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Peso normal");
        } else if (imc < 30.0) {
            System.out.println("Sobrepeso (Pré-obesidade)");
        } else if (imc < 35.0) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40.0) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }
        sc.close();
    }
}