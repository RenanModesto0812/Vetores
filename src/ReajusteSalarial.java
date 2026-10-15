import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[8];
        double[] salariosAntes = new double[8];
        double[] salariosDepois = new double[8];
        double aumentoTotalFolha = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Nome do funcionário " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Salário atual de " + nomes[i] + ": R$ ");
            salariosAntes[i] = scanner.nextDouble();
            scanner.nextLine();

            double novoSalario = salariosAntes[i] * 1.10; // um aumentinho daquele modelo de +10%
            if (novoSalario > 5000.00) {
                novoSalario = 5000.00;
            }

            salariosDepois[i] = novoSalario;
            aumentoTotalFolha += (salariosDepois[i] - salariosAntes[i]);
        }

        System.out.println("\n--- Relatório de Salários ---");
        for (int i = 0; i < 8; i++) {
            String statusTeto = (salariosDepois[i] == 5000.00 && salariosAntes[i] * 1.10 > 5000.00) ? " [ATINGIU O TETO]" : "";
            System.out.printf("%s: Antes: R$ %.2f | Depois: R$ %.2f%s\n",
                    nomes[i], salariosAntes[i], salariosDepois[i], statusTeto);
        }
        System.out.printf("\nAumento total da folha: R$ %.2f\n", aumentoTotalFolha);
        scanner.close();
    }
}