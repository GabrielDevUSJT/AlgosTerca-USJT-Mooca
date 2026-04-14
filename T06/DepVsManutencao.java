package T06;

import java.util.Scanner;

public class DepVsManutencao {

    public static void main(String[] args) {

        double valorMercado = 500000.00;
        double manutencao = 15000.00;
        double custoAcumulado = 0;
        int ano = 0;

        System.out.println("Ano\tValor de Mercado\tManutencao Anual\tCusto Acumulado");
        System.out.println("-------------------------------------------------------------------------");

        while (custoAcumulado <= valorMercado) {
            ano = ano + 1;

            valorMercado = valorMercado - (valorMercado * 0.12);
            custoAcumulado = custoAcumulado + manutencao;

            System.out.printf("%d\t\tR$ %10.2f\t\tR$ %8.2f\t\tR$ %10.2f%n",
                    ano, valorMercado, manutencao, custoAcumulado);

            manutencao = manutencao + 5000;
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("No ano " + ano + " o custo acumulado de manutencao ultrapassou o valor de mercado!");
    }
}