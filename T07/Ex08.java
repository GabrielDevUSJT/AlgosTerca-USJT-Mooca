import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {        // controla as linhas
            for (int j = 1; j <= i; j++) {    // imprime de 1 até i
                System.out.print(j + " ");
            }
            System.out.println();              // quebra de linha ao final de cada i
        }
        sc.close();
    }
}