import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor do primeiro cateto: ");
        double cateto1 = sc.nextDouble();
        System.out.print("Qual o valor do segundo cateto: ");
        double cateto2 = sc.nextDouble();
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.printf("O valor da hipotenusa é: %.2f", hipotenusa);
        sc.close();
    }
}
