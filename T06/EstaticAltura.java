package T06;

import java.util.Scanner;

public class EstaticAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_BLOCOS = 10;
        double somaAlturas = 0;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;

        for (int i = 0; i < NUM_BLOCOS; i++) {
            System.out.print("Digite a altura do bloco " + (i + 1) + ": ");
            double altura = sc.nextDouble();
            somaAlturas += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        double mediaAlturas = somaAlturas / NUM_BLOCOS;

        System.out.println("Média das alturas: " + mediaAlturas);
        System.out.println("Maior altura digitada: " + maiorAltura);
        System.out.println("Menor altura digitada: " + menorAltura);
        sc.close();
    }
}