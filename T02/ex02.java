import java.util.Scanner;   
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor em reais recebido: ");
        double valor = sc.nextDouble();
        System.out.println("A cotação atual do dolar é de: 5.25");
        double cotacao = 5.25;
        double valorDolar = valor / cotacao;
        System.out.printf("O valor em dolares é: US$ %.2f", valorDolar);
        sc.close();
    }
}
