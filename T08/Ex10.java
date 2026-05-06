import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            v[i] = sc.nextInt();
        }
        int ultimo = v[4];
        for(int i=4;i>0;i--){
            v[i] = v[i-1];
        }
        v[0] = ultimo;
        for(int i=0;i<5;i++){
            System.out.println(v[i]);
        }
    }
}