import java.util.Scanner;

public class MenuTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double resultado;

        do {
            System.out.println("\n=== Conversor de Temperaturas ===");
            System.out.println("1- Celsius para Fahrenheit");
            System.out.println("2- Fahrenheit para Celsius");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double temp = sc.nextDouble();
                    resultado = (temp * 1.8) + 32;
                    System.out.printf("\n%.2f°C equivale a %.2f°F\n", temp, resultado);
                    break;
                    
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    temp = sc.nextDouble();
                    resultado = (temp - 32) / 1.8;
                    System.out.printf("\n%.2f°F equivale a %.2f°C\n", temp, resultado);
                    break;
                    
                case 3:
                    System.out.println("\nEncerrando o programa...");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida!");
            }
            
        } while (opcao != 3);
        sc.close();
    }
}