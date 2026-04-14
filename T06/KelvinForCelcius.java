package T06;


public class KelvinForCelcius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial em Kelvin: ");
        double inicio = sc.nextDouble();

        System.out.print("Digite o valor final em Kelvin: ");
        double fim = sc.nextDouble();

        System.out.print("Digite o passo: ");
        double passo = sc.nextDouble();

        System.out.println();
        System.out.println("Kelvin\t\tCelsius");
        System.out.println("------------------------");

        double atual = inicio;

        while (atual <= fim) {
            double celsius = atual - 273.15;
            System.out.printf("%.2f\t\t%.2f%n", atual, celsius);
            atual = atual + passo;
        }

        sc.close();
    }
}
