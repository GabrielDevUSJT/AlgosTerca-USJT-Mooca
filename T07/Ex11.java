import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String senhaCorreta = "1234";

        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            
            String senhaDigitada;

            do {
                System.out.print("Tentativa " + tentativa + " - Digite uma senha de 4 dígitos: ");
                senhaDigitada = sc.nextLine();
                
                if (senhaDigitada.length() != 4) {
                    System.out.println("A senha deve ter exatamente 4 dígitos!");
                }
                
            } while (senhaDigitada.length() != 4);

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                System.out.println("Senha incorreta!");
            }

            if (tentativa == 3) {
                System.out.println("Acesso bloqueado!");
            }
        }
        sc.close();
    }
}