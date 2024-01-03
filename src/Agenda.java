import java.util.Scanner;

public class Agenda {
    private String texto;

    private Scanner scanner;

    public Agenda() {
        this.scanner = new Scanner(System.in);
    }

    public void escreverTexto() {
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Escreva o texto na agenda:");
        texto = scanner.nextLine();
        System.out.println("Texto salvo na agenda!");
    }

    public void editarTexto() {
        if (texto != null && !texto.isEmpty()) {
            System.out.println("Texto atual na agenda:");
            System.out.println(texto);
            System.out.println("Digite o novo texto:");
            texto = scanner.nextLine();
            System.out.println("Texto editado na agenda!");
        } else {
            System.out.println("Não há texto na agenda para editar. Escreva um texto primeiro.");
        }
    }

    public void lerTexto() {
        if (texto != null && !texto.isEmpty()) {
            System.out.println("Texto na agenda:");
            System.out.println(texto);
        } else {
            System.out.println("Não há texto na agenda.");
        }
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("\nAgenda - O que você gostaria de fazer?");
            System.out.println("1. Escrever texto");
            System.out.println("2. Editar texto");
            System.out.println("3. Ler texto");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    escreverTexto();
                    break;
                case 2:
                    editarTexto();
                    break;
                case 3:
                    lerTexto();
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }
}
