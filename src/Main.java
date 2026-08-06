import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Agenda agenda = new Agenda(20);

        int opcao;

        do {

            System.out.println("===== AGENDA =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Buscar por telefone");
            System.out.println("5 - Atualizar contato");
            System.out.println("6 - Listar contatos");
            System.out.println("7 - Inserir em lote");
            System.out.println("8 - Buscar por prefixo");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 0:

                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 0);

        scanner.close();

    }

}