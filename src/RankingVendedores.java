public class RankingVendedores {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo", "Fernanda"};
        double[] vendas = {12000.50, 8500.00, 23000.00, 15400.90, 9100.00, 31000.20};

        for (int i = 0; i < vendas.length - 1; i++) {
            for (int j = 0; j < vendas.length - 1 - i; j++) {
                if (vendas[j] > vendas[j + 1]) {

                    double tempVenda = vendas[j];
                    vendas[j] = vendas[j + 1];
                    vendas[j + 1] = tempVenda;

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }
        System.out.println("--- RANKING CRESCENTE (Do menor para o maior) ---");
        for (int i = 0; i < vendas.length; i++) {
            System.out.printf("%dº: %s - R$ %.2f\n", (i + 1), nomes[i], vendas[i]);
        }
    }
}