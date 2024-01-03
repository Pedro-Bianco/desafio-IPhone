import java.util.Scanner;

public class ReprodutorMusical {
    public void tocar() {
        System.out.println("Música tocando");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nReprodutor Musical - O que você gostaria de fazer?");
            System.out.println("1. Tocar música");
            System.out.println("2. Pausar música");
            System.out.println("3. Selecionar música");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    tocar();
                    break;
                case 2:
                    pausar();
                    break;
                case 3:
                    selecionarMusica();
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
