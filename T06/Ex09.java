import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int b = sc.nextInt();

        System.out.print("Digite o número: ");
        int n = sc.nextInt();

        int count = 0;
        while (n > 1) {
            n = n / b;
            count++;
        }
        System.out.println("O logaritmo de " + n + " na base " + b + " é: " + count);
        sc.close();
    }
}