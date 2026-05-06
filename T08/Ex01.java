import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            v[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(v[i] > 0){
                System.out.println(v[i]);
            }
        }
    }
}