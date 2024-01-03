import java.util.Scanner;

public class AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando telefone");
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nAparelho Telefônico - O que você gostaria de fazer?");
            System.out.println("1. Fazer uma ligação");
            System.out.println("2. Atender uma chamada");
            System.out.println("3. Iniciar correio de voz");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ligar();
                    break;
                case 2:
                    atender();
                    break;
                case 3:
                    iniciarCorreioVoz();
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
