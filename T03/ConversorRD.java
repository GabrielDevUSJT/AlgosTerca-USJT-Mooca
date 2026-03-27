
import java.util.Scanner;

public class ConversorRD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Conversor de Real para Dolar ===");
        System.out.println("Digite a quantidade em real: ");
        double real = sc.nextDouble();

        double dolar = real * 5.0;
        System.out.println("\na quantidade em real foi: " + real);
        System.out.println("resultaddo em dolar: " + dolar);
        sc.close();
    }
}
