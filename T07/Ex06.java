public class Ex06 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== CRONÔMETRO INDUSTRIAL ===\n");

        for (int minuto = 0; minuto <= 2; minuto++) {
            System.out.println(">>> Minuto " + minuto + " iniciado");
            for (int segundo = 0; segundo <= 59; segundo++) {
                System.out.printf("Tempo: %02d:%02d%n", minuto, segundo);
                Thread.sleep(1000); // aguarda 1 segundo real
            }
        }
        System.out.println("\n=== PROCESSO CONCLUÍDO ===");
    }
}