import java.util.Scanner;

public class VendasSemanas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] faturamento = new double[7];
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        double total = 0;
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o faturamento de " + dias[i] + ": ");
            faturamento[i] = scanner.nextDouble();
            total += faturamento[i];

            if (faturamento[i] > faturamento[indiceMaior]) {
                indiceMaior = i;
            }
            if (faturamento[i] < faturamento[indiceMenor]){
                indiceMenor = i;
            }
        }
        double media = total / 7;
        System.out.println("\n--- Resultado ---");
        System.out.printf("Total vendido na semana: R$ %.2f\n", total);
        System.out.printf("Média diária de vendas: R$ %.2f\n", media);
        System.out.println("Dia com MAIOR venda: " + dias[indiceMaior] + " (R$ " + faturamento[indiceMaior] + ")");
        System.out.println("Dia com MENOR venda: " + dias[indiceMenor] + " (R$ " + faturamento[indiceMenor] + ")"); // Exibição do menor

        scanner.close();
    }
}
