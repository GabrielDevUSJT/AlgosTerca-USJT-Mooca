import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];
        for(int i=0;i<10;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            b[i] = sc.nextInt();
        }
        int j = 0;
        for(int i=0;i<10;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            c[j++] = a[i];
            c[j++] = b[i];
        }
        for(int i=0;i<20;i++){
            System.out.println(c[i]);
        }
    }
}