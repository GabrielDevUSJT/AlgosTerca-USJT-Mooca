import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio da base do cilindro: ");
        double raio = sc.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altura = sc.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.printf("O volume do cilindro é: %.2f m2", volume);
        sc.close();
    }
    
}
