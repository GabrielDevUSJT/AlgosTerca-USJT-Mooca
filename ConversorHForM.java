
import java.util.Scanner;

public class ConversorHForM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor de Tempo ===");
        System.out.println("Digite o tempo em segundos: ");
        int totals = sc.nextInt();

        int horas = totals / 3600;
        int restante = totals % 3600;

        int minutos = restante / 60;
        int segundos = restante % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        sc.close();
    }
}
