import java.util.Scanner;

public class ConsultaPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = {"Arroz", "Feijão", "Azeite", "Macarrão", "Café"};
        double[] precos = {25.50, 8.00, 39.90, 4.50, 14.20};
        System.out.print("Digite o NOME do produto para consulta: ");
        String produtoBuscado = scanner.nextLine();

        int indiceEncontrado = -1;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equalsIgnoreCase(produtoBuscado)) {
                indiceEncontrado = i;
                break;
            }
        }
        if (indiceEncontrado != -1) {
            System.out.printf("Produto: %s | Preço: R$ %.2f\n", produtos[indiceEncontrado], precos[indiceEncontrado]);
        } else {
            System.out.println("Produto não cadastrado");
        }
        scanner.close();
    }
}