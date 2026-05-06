import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double[] pesos = new double[5];
        double soma = 0;
        double somaPesos = 0;
        for(int i=0;i<5;i++){
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }
        for(int i=0;i<5;i++){
            System.out.print("Digite o peso da nota " + (i+1) + ": ");
            pesos[i] = sc.nextDouble();
        }
        for(int i=0;i<5;i++){
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        System.out.println(soma / somaPesos);
    }
}