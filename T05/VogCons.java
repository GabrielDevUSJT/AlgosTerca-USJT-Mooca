
import java.util.Scanner;

public class VogCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n== Descobrir se é Vogal ou Consoante ==");
        System.out.print("\nDigite uma letra: ");
        char letra = sc.next().toUpperCase().charAt(0);
        
        switch (letra) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("A letra '" + letra + "' é uma vogal.");
                break;
            default:
                System.out.println("A letra '" + letra + "' é uma consoante.");
                break;
        }
    }
}
