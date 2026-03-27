
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Calculo de Média ===");
        System.out.println("\nDigite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double mediaF = (n1+n2)/2;
        
        System.out.println("=== RESULTADO ===");
        System.out.println("sua média foi " + mediaF);
        if (mediaF >= 6) {
            System.out.println("aprovado!");
        } else {
            System.out.println("Exame!");
        }
        sc.close();
    }
}
