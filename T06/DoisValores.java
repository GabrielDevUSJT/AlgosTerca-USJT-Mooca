package T06;
import java.util.Scanner;

public class DoisValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro (a): ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número inteiro (b): ");
        int b = sc.nextInt();

        System.out.println("Números inteiros entre " + a + " e " + b + ":");
        int menor = Math.min(a, b);
        int maior = Math.max(a, b);

        while (menor < maior) {
            menor++;
            if (menor < maior) {
                System.out.println(menor);
            }
        }
        sc.close();
    }
}