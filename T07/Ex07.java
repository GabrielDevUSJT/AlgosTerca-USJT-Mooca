import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;
        int numeroLote = 1;

        do {
            System.out.println("\n=== LOTE #" + numeroLote + " ===");
            double soma = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Medida da peça " + i + ": ");
                double medida = sc.nextDouble();
                soma += medida;
            }

            double media = soma / 5;
            System.out.printf("Média do lote #%d: %.2f%n", numeroLote, media);
            numeroLote++;
            System.out.print("\nDeseja processar um novo lote? (s/n): ");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("s"));
        System.out.println("\nProcessamento encerrado. Total de lotes: " + (numeroLote - 1));
        sc.close();
    }
}