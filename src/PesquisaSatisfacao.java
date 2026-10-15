import java.util.Scanner;

public class PesquisaSatisfacao{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] contagemVotos = new int[23];

            int totalEleitores = 10;

            System.out.println("--- PESQUISA ELEITORAL ---");
            System.out.println("Opções válidas: [13] Lula | [22] Flávio Bolsonaro | [0] Branco/Nulo");
            System.out.println("Digite o voto de " + totalEleitores + " pessoas:\n");

            for (int i = 0; i < totalEleitores; i++) {
                System.out.print("Eleitor " + (i + 1) + ": ");
                int voto = scanner.nextInt();

                if (voto == 13 || voto == 22 || voto == 0) {
                    contagemVotos[voto]++;
                } else {
                    System.out.println("Voto inválido! Escolha apenas 13, 22 ou 0.");
                    i--;
                }
            }

            System.out.println("\n--- Resultado da Apuração ---");
            System.out.println("Lula (13): " + contagemVotos[13] + " voto(s)");
            System.out.println("Flávio Bolsonaro (22): " + contagemVotos[22] + " voto(s)");
            System.out.println("Brancos/Nulos (0): " + contagemVotos[0] + " voto(s)");

            int maiorVoto = contagemVotos[13];
            if (contagemVotos[22] > maiorVoto) {
                maiorVoto = contagemVotos[22];
            }

            System.out.println("\n--- Estatísticas Finais ---");
            if (contagemVotos[13] == contagemVotos[22] && maiorVoto > 0) {
                System.out.println("Resultado: Empate técnico entre os candidatos com " + maiorVoto + " voto(s) cada!");
            } else if (maiorVoto == contagemVotos[13] && contagemVotos[13] > 0) {
                System.out.println("Candidato mais votado na pesquisa: Lula (13) com " + contagemVotos[13] + " voto(s)");
            } else if (maiorVoto == contagemVotos[22] && contagemVotos[22] > 0) {
                System.out.println("Candidato mais votado na pesquisa: Flávio Bolsonaro (22) com " + contagemVotos[22] + " voto(s)");
            } else {
                System.out.println("Todos os votos coletados foram Brancos ou Nulos.");
            }

            scanner.close();
        }
    }