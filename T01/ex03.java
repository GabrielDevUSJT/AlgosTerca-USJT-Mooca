import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        int estoquemin = 5;
        int estoquemax = 20;
        System.out.println("Seja bem-vindo ao sistema de controle de estoque!");
        System.out.println("O estoque mínimo é: " + estoquemin);
        System.out.println("O estoque máximo é: " + estoquemax);
        System.out.print("Informe a quantidade em estoque: ");
        int estoque = sc.nextInt();
        // Verificar se o estoque está abaixo do mínimo ou acima do máximo
        if (estoque < estoquemin) {
            System.out.println("Estoque abaixo do mínimo. Necessário comprar mais.");
        } else if (estoque > estoquemax) {
            System.out.println("Estoque acima do máximo. Não é necessário comprar.");
        } else {
            System.out.println("Estoque dentro dos limites. Verificar novamente em breve.");
        }   sc.close(); 

    }
}
