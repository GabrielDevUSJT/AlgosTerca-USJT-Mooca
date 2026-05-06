import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[15];
        for(int i=0;i<15;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            v[i] = sc.nextDouble();
        }
        double maior = v[0];
        double menor = v[0];
        for(int i=1;i<15;i++){
            if(v[i] > maior){
                maior = v[i];
            }
            if(v[i] < menor){
                menor = v[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }
}