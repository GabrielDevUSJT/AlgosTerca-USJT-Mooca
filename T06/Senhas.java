package T06;

import java.util.Scanner;

public class Senhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SENHA_CORRETA = 2026;
        int tentativas = 3;
        boolean acessoPermitido = false;

        while (tentativas > 0) {
            System.out.print("Digite a senha numérica: ");
            int senhaDigitada = sc.nextInt();

            if (senhaDigitada == SENHA_CORRETA) {
                acessoPermitido = true;
                break;
            } else {
                tentativas--;
                System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
            }
        }

        if (acessoPermitido) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Terminal Bloqueado!");
        }
        sc.close();
    }
}