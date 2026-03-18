
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculo de Média ===");
        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        double mediaF = (n1+n2+n3)/3;
        
        System.out.println("=== RESULTADO ===");
        System.out.println("sua média foi " + mediaF);
        if (mediaF >=7) {
            System.out.println("aprovado!");
        } else {
            System.out.println("reprovado!");
        }
        sc.close();
    }
}
