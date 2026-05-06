import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            v[i] = sc.nextInt();
        }
        System.out.print("Digite o número a ser buscado: ");
        int x = sc.nextInt();
        int count = 0;
        for(int i=0;i<10;i++){
            if(v[i] == x){
                count++;
            }
        }
        System.out.println(count);
    }
}