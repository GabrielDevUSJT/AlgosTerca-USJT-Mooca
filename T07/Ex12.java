import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        System.out.print("Fatores: ");

        do {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    num = num / i;
                    break;
                }
            }
        } while (num > 1);
    }
}