import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a potência do aparelho em watts: ");
        double potencia = sc.nextDouble();
        System.out.print("Quantas horas por dia o aparelho é utilizado: ");
        double horas = sc.nextDouble();
        System.out.printf("O consumo diário do aparelho é: %.2f kWh", potencia * horas / 1000);
        sc.close();
    }
    
}
