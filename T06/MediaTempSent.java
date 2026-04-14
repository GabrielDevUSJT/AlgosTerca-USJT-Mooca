package T06;

import java.util.Scanner;

public class MediaTempSent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int contador = 0;

        System.out.print("Digite as temperaturas (digite 999 para encerrar): ");
        while (true) {
            int temperatura = sc.nextInt();
            if (temperatura == 999) {
                break;
            }
            soma += temperatura;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média das temperaturas válidas: " + media);
        } else {
            System.out.println("Nenhuma temperatura válida foi digitada.");
        }
        sc.close();
    }
} 
    

