import java.util.Scanner;

public class ConversorTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Tranformador de Celcius para fahrenheit ===");
        System.out.print("Digite a quantidade em Celcius: ");
        double celcius = sc.nextDouble();    

        double fahrenheit = (celcius * 9.0/5.0) + 32;
        System.out.println("=== RESULTADO ===");
        System.out.println("A quantidade de Celcius é " + celcius);
        System.out.println("Em fahrenheit: " + fahrenheit);
    }
} 