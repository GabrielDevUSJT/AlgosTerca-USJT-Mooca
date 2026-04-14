import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        while (n >= 0) {
            System.out.println("Sistema operando. T-menos " + n + " segundos;");
            n--;
        }
        sc.close();
    }

}