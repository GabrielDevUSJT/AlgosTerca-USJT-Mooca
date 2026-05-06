import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] v = new String[5];
        for(int i=0;i<5;i++){
            System.out.print("Digite a palavra " + (i+1) + ": ");
            v[i] = sc.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.print("Palavra " + (i+1) + ": ");
            System.out.println(v[i]);
        }
    }
}