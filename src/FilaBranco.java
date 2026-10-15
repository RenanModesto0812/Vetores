import java.util.Scanner;

public class FilaBranco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] senhas = new int[10];
        boolean[] ehIdoso = new boolean[10];

        System.out.println("--- Cadastro da Fila Inicial ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a senha do cliente " + (i + 1) + ": ");
            senhas[i] = scanner.nextInt();
            System.out.print("O cliente é idoso? (1 - Sim / 2 - Não): ");
            int opcao = scanner.nextInt();
            ehIdoso[i] = (opcao == 1);
        }

        int tamanhoAtual = 10;
        for (int atendimento = 1; atendimento <= 3; atendimento++) {
            int indiceAtendido = -1;

            for (int i = 0; i < tamanhoAtual; i++) {
                if (ehIdoso[i]) {
                    indiceAtendido = i;
                    break;
                }
            }
            if (indiceAtendido == -1 && tamanhoAtual > 0) {
                indiceAtendido = 0;
            }
            if (indiceAtendido != -1) {
                System.out.println("\n--- Atendimento #" + atendimento + " ---");
                System.out.println("Chamando: " + senhas[indiceAtendido] + (ehIdoso[indiceAtendido] ? " [PREFERENCIAL]" : " [NORMAL]"));

                for (int i = indiceAtendido; i < senhas.length - 1; i++) {
                    senhas[i] = senhas[i + 1];
                    ehIdoso[i] = ehIdoso[i + 1];
                }
                senhas[senhas.length - 1] = 0;
                ehIdoso[ehIdoso.length - 1] = false;
                tamanhoAtual--;

                System.out.print("Fila restante: ");
                for (int i = 0; i < tamanhoAtual; i++) {
                    System.out.print("[" + senhas[i] + (ehIdoso[i] ? "* " : " ") + "] ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}