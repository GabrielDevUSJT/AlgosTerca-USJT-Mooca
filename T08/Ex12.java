import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            v[i] = sc.nextInt();
        }
        int[] temp = new int[10];
        int k = 0;
        for(int i=0;i<10;i++){
            int count = 0;
            for(int j=0;j<10;j++){
                if(v[i] == v[j]){
                    count++;
                }
            }
            if(count == 1){
                temp[k++] = v[i];
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(temp[i]);
        }
    }
}