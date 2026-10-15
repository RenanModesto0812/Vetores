public class JuntandoRelatorios {
    public static void main(String[] args) {
        double[] filial1 = {1000.00, 2500.50, 5000.00};
        double[] filial2 = {1500.00, 3000.00, 4500.10, 6000.00};

        double[] resultadoFinal = new double[filial1.length + filial2.length];

        int i = 0, j = 0, k = 0;

        while (i < filial1.length && j < filial2.length) {
            if (filial1[i] <= filial2[j]) {
                resultadoFinal[k] = filial1[i];
                i++;
            } else {
                resultadoFinal[k] = filial2[j];
                j++;
            }
            k++;
        }
        while (i < filial1.length) {
            resultadoFinal[k] = filial1[i];
            i++;
            k++;
        }
        while (j < filial2.length) {
            resultadoFinal[k] = filial2[j];
            j++;
            k++;
        }
        System.out.print("Relatório Final Combinado: ");
        for (double venda : resultadoFinal) {
            if (venda > 0) {
                System.out.printf("[R$ %.2f] ", venda);
            }
        }
        System.out.println();
    }
}