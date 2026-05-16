import java.util.Scanner;
import java.util.ArrayList;

class Agenda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();
        int opcao;

        while (true) {
            menuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine(); /* Limpar buffer */

            if (opcao == 5) {
                break;
            }

            switch (opcao) {
                case 1:
                    adicionarContato(scanner, lista);
                    break;
                case 2:
                    editarContato(scanner, lista); // Chama a lógica de edição
                    break;
                case 3:
                    excluirContato(scanner, lista); // Chama a lógica de exclusão
                    break;
                case 4:
                    listarContatos(lista);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void menuPrincipal() {
        System.out.println("======= AGENDA =======");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }

    public static void menuEditar() {
        System.out.println("\n=== EDITAR CONTATO ===");
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar nome");
        System.out.println("[3] Voltar");
        System.out.print("\nEscolha uma opcao: ");
    }

    public static void adicionarContato(Scanner scanner, ArrayList<Contato> lista) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        lista.add(new Contato(nome, telefone));
        System.out.println("Contato adicionado!");
    }

    public static void listarContatos(ArrayList<Contato> lista) {
        if (lista.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }

        // Adicionei o ID (índice) para o usuário saber qual número digitar ao editar/excluir
        System.out.printf("\n%-5s | %-20s | %-10s\n", "ID", "Nome", "Telefone");
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%-5d | %-20s | %-10s\n",
                    i, lista.get(i).getNome(), lista.get(i).getTelefone());
        }
    }

    public static void excluirContato(Scanner scanner, ArrayList<Contato> lista) {
        listarContatos(lista);
        if (lista.isEmpty()) return;

        System.out.print("\nDigite o ID do contato que deseja excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (id >= 0 && id < lista.size()) {
            lista.remove(id); // Remove o objeto da lista pelo índice
            System.out.println("Contato excluído!");
        } else {
            System.out.println("ID inválido!");
        }
    }

    public static void editarContato(Scanner scanner, ArrayList<Contato> lista) {
        listarContatos(lista);
        if (lista.isEmpty()) return;

        System.out.print("\nDigite o ID do contato que deseja editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (id >= 0 && id < lista.size()) {
            while (true) {
                menuEditar();
                int opEditar = scanner.nextInt();
                scanner.nextLine();

                if (opEditar == 3) break;

                switch (opEditar) {
                    case 1:
                        System.out.print("Novo Telefone: ");
                        String novoTel = scanner.nextLine();
                        lista.get(id).setTelefone(novoTel); // Usa o Setter para alterar
                        System.out.println("Telefone atualizado!");
                        break;
                    case 2:
                        System.out.print("Novo Nome: ");
                        String novoNome = scanner.nextLine();
                        lista.get(id).setNome(novoNome); // Precisará do setNome na classe Contato
                        System.out.println("Nome atualizado!");
                        break;
                    default:
                        System.out.println("Opcao invalida!");
                }
            }
        } else {
            System.out.println("ID inválido!");
        }
    }
}