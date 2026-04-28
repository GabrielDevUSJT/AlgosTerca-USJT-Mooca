public class Ex10 {
    public static void main(String[] args) {
        
        System.out.println("Tabela de Estresse (S = x² + y²):\n");

        for (int x = 1; x <= 5; x++) {

            for (int y = 1; y <= 5; y++) {
                int S = (x * x) + (y * y);
                System.out.printf("%4d", S);
            }
            System.out.println();
        }
    }
}