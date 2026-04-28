import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;
        do {
            System.out.print("Digite um número inteiro: ");
            int n = sc.nextInt();
            int soma = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    soma += i;
                }
            }

            System.out.println("A soma dos números pares entre 1 e " + n + " é: " + soma);

            System.out.print("Deseja repetir o cálculo? (s/n): ");
            repetir = sc.next().charAt(0);
        } while (repetir == 's' || repetir == 'S');
    }
}