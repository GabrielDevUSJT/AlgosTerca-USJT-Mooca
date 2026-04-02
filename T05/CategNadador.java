import java.util.Scanner;

public class CategNadador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Categoria do Nadador ===");
        System.out.print("\nDigite a idade do nadador: ");
        int idade = sc.nextInt();

        if (idade > 18) {
            System.out.println("Categoria: Adulta");
        } else if (idade >= 14) {
            System.out.println("Categoria: Juvenil");
        } else if (idade >= 10) {
            System.out.println("Categoria: Infantil");
        } else {
            System.out.println("Categoria: Mirim");
        }
        sc.close();
    }
}     

