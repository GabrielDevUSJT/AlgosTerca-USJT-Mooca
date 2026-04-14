import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe a resistência (Ohms): ");
        double resistencia = sc.nextDouble();
        System.out.print("Informe a corrente (Amperes): ");
        double corrente = sc.nextDouble();
        // Cálculo da tensão (V = I * R)
        double tensao = corrente * resistencia;
        // Saída
        System.out.println("A tensão é: " + tensao + " Volts");
        sc.close();

    }
}
