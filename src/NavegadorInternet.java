import java.util.Scanner;

public class NavegadorInternet {
    public void exibirPagina() {
        System.out.println("Exibindo página da internet");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nNavegador na Internet - O que você gostaria de fazer?");
            System.out.println("1. Exibir página");
            System.out.println("2. Adicionar nova aba");
            System.out.println("3. Atualizar página");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirPagina();
                    break;
                case 2:
                    adicionarNovaAba();
                    break;
                case 3:
                    atualizarPagina();
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
