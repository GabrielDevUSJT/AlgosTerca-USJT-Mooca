import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distância percorrida em km: ");
        double distancia = sc.nextDouble();
        System.out.print("Qual foi o tempo gasto em horas: ");
        double tempo = sc.nextDouble();
        double velocidade = distancia / tempo;
        System.out.println("A velocidade do veiculo é: " + velocidade + " km/h");
    }
}