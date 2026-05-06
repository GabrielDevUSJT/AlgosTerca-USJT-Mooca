import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            b[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            c[i] = a[i] * b[i];
            System.out.println(c[i]);
        }
    }
}