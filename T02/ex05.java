import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio da praça: ");
        double raio = sc.nextDouble();
        System.out.print("Valor do m2 do piso: ");
        double valor = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        double custo = area * valor;
        System.out.printf("O custo para revestir a praça é: R$ %.2f", custo);
        sc.close();
    }
}
