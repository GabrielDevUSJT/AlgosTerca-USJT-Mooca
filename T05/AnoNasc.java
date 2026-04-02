
import java.util.Scanner;

public class AnoNasc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Verificação Ano de Nascimento ===");
        System.out.print("\nDigite o ano de nascimento: ");
        int anoNasc = sc.nextInt();

        if (anoNasc < 1900 || anoNasc > 2026) {
            System.out.println("Ano de nascimento inválido.");
        } else if (anoNasc <= 2000) {
            System.out.println("Você nasceu no século XX.");
        } else {
            System.out.println("Você nasceu no século XXI.");
        }

        sc.close();
    }
}
