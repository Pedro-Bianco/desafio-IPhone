import java.util.Scanner;

public class IPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
    private Agenda agenda;

    public void ligar() {
        System.out.println("iPhone ligado");
    }

    public void atender() {
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nBem-vindo ao iPhone! Escolha uma funcionalidade:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("4. Agenda");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    reprodutorMusical.menu();
                    break;
                case 2:
                    aparelhoTelefonico.menu();
                    break;
                case 3:
                    navegadorInternet.menu();
                    break;
                case 4:
                    agenda.menu();
                    break;
                case 0:
                    System.out.println("Saindo do iPhone...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        meuIPhone.setReprodutorMusical(new ReprodutorMusical());
        meuIPhone.setAparelhoTelefonico(new AparelhoTelefonico());
        meuIPhone.setNavegadorInternet(new NavegadorInternet());
        meuIPhone.setAgenda(new Agenda());

        meuIPhone.menu();
    }
}
