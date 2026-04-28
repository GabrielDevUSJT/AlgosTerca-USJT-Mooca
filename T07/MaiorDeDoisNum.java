import java.util.Scanner;

public class MaiorDeDoisNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2;

        do {
            System.out.print("Digite a primeira nota (0-10): ");
            nota1 = sc.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a segunda nota (0-10): ");
            nota2 = sc.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        System.out.print("Processando");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println();

        double media = (nota1 + nota2) / 2;
        System.out.printf("A média aritmética das notas é: %.2f%n", media);
    }
}