import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        double soma = 0;
        for(int i=0;i<10;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            v[i] = sc.nextDouble();
            soma += v[i];
        }
        System.out.println(soma);
    }
}