import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();
            if (n >= 10 && n <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Números dentro do intervalo [10, 20]: " + dentro);
        System.out.println("Números fora do intervalo [10, 20]: " + fora);
    }
}