import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Cédulas e Moedas ===");
        System.out.print("\nDigite o valor: ");
        int valor = sc.nextInt();
        int resto = valor;

        int notas100 = resto / 100;
        resto = resto % 100;

        int notas50 = resto / 50;
        resto = resto % 50;

        int notas20 = resto / 20;
        resto = resto % 20;

        int notas10 = resto / 10;
        resto = resto % 10;

        int notas5 = resto / 5;
        resto = resto % 5;

        int notas2 = resto / 2;
        resto = resto % 2;

        int moedas1 = resto; 
        
        System.out.println("=============================");
        System.out.println("\nValor: R$ " + valor);
        System.out.println(notas100 + " nota(s) de R$ 100");
        System.out.println(notas50 + " nota(s) de R$ 50");
        System.out.println(notas20 + " nota(s) de R$ 20");
        System.out.println(notas10 + " nota(s) de R$ 10");
        System.out.println(notas5 + " nota(s) de R$ 5");
        System.out.println(notas2 + " nota(s) de R$ 2");
        System.out.println(moedas1 + " moeda(s) de R$ 1");
        System.out.println("=============================");
        
        sc.close();
    }
}