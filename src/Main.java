package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(0, 0, 0); // Inicializa com meia-noite

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ajustar Hora");
            System.out.println("2 - Reiniciar para Meia-Noite");
            System.out.println("3 - Marcar Intervalo");
            System.out.println("4 - Imprimir Hora (Formato 24h)");
            System.out.println("5 - Imprimir Hora (Formato AM/PM)");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a nova hora: ");
                    int novaHora = scanner.nextInt();
                    System.out.println("Informe o novo minuto: ");
                    int novoMinuto = scanner.nextInt();
                    System.out.println("Informe o novo segundo: ");
                    int novoSegundo = scanner.nextInt();
                    relogio.acertaHora(novaHora, novoMinuto, novoSegundo);
                    System.out.println("Hora ajustada com sucesso!");
                    break;
                case 2:
                    relogio.reiniciarParaMeiaNoite();
                    System.out.println("Relógio reiniciado para meia-noite!");
                    break;
                case 3:
                    System.out.println("Informe a hora, minuto e segundo iniciais: ");
                    int horaInicial = scanner.nextInt();
                    int minutoInicial = scanner.nextInt();
                    int segundoInicial = scanner.nextInt();
                    System.out.println("Informe a hora, minuto e segundo finais: ");
                    int horaFinal = scanner.nextInt();
                    int minutoFinal = scanner.nextInt();
                    int segundoFinal = scanner.nextInt();
                    relogio.marcarIntervalo(horaInicial, minutoInicial, segundoInicial, horaFinal, minutoFinal, segundoFinal);
                    System.out.println("Intervalo marcado com sucesso!");
                    break;
                case 4:
                    System.out.println("Hora Formatada (24h): " + relogio.imprimirHora(true));
                    break;
                case 5:
                    System.out.println("Hora Formatada (AM/PM): " + relogio.imprimirHora(false));
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
