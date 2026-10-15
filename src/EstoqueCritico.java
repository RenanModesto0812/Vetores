import java.util.Scanner;

public class EstoqueCritico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] estoque = new int[10];

        String[] nomeProdutos = new String[10];
        System.out.print("Defina a quantidade limite para estoque crítico: ");
        int limiteCritico = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            nomeProdutos[i] = scanner.nextLine();
            System.out.print("Quantidade em estoque de " + nomeProdutos[i] + ": ");
            estoque[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("\n--- Produtos com estoque crítico (< " + limiteCritico + " unidades) ---");
        int contadorCritico = 0;
        for (int i = 0; i < 10; i++) {
            if (estoque[i] < limiteCritico) {
                System.out.println("Posição: " + i + " | " + nomeProdutos[i] + " | Qtd: " + estoque[i]);
                contadorCritico++;
            }
        }
        System.out.println("Total de produtos críticos: " + contadorCritico);
        scanner.close();
    }
}