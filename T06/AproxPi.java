package T06;

import java.util.Scanner;

public class AproxPi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de termos: ");
        int termos = sc.nextInt();
        double soma = 0;
        int i = 0;

        while (i < termos) {
            double denominador = (2 * i) + 1;

            if (i % 2 == 0) {
                soma = soma + (1.0 / denominador);
            } else {
                soma = soma - (1.0 / denominador);
            }

            i++;
        }

        double piAproximado = 4 * soma;
        double erro = Math.abs(Math.PI - piAproximado);
        double erroPorcentagem = (erro / Math.PI) * 100;

        System.out.println();
        System.out.printf("Termos calculados : %d%n", termos);
        System.out.printf("PI aproximado     : %.10f%n", piAproximado);
        System.out.printf("Math.PI           : %.10f%n", Math.PI);
        System.out.printf("Diferenca         : %.10f%n", erro);
        System.out.printf("Erro              : %.8f%%%n", erroPorcentagem);

        sc.close();
    }
}