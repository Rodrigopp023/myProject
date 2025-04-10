import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ToDoLists {
    private static ArrayList<Item> listaDeItens = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("----Menu----");
            System.out.println("Opção->[1] - Adicionar item");
            System.out.println("Opção->[2] - remover item");
            System.out.println("Opção->[3] - Listar item");
            System.out.println("Opção->[4] - Sair");
            System.out.println("Escolha uma das opções, por favor!");
            option = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (option) {
                case 1:
                    adcionarItem();
                    break;
                case 2:
                    removerItem();
                    break;
                case 3:
                    listarItem();
                    break;
                case 4:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 4);
    }

    public static void adcionarItem() {
        System.out.println("Nome do item: ");
        String nome = scanner.nextLine();

        System.out.println("Quantidade de itens: ");
        int quantidades = scanner.nextInt();

        System.out.println("Preço do item: ");
        double preco = scanner.nextDouble();

        Date data = new Date();  // Pega a data atual
        scanner.nextLine();  // Limpa o buffer

        Item novoItem = new Item(nome, preco, quantidades, data);
        listaDeItens.add(novoItem);

        System.out.println("Item adicionado com sucesso!");
    }

    private static void removerItem() {
        System.out.println("Nome do para remover: ");
        String nome = scanner.nextLine();

        boolean removido = listaDeItens.removeIf(item -> item.getNome().equalsIgnoreCase(nome));

        if (removido) {
            System.out.println("Item removido.");
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    private static void listarItem() {
        if (listaDeItens.isEmpty()) {
            System.out.println("A sua lista está vazia.");
        } else {
            System.out.println("\n---- Sua lista ----");
            for (Item item : listaDeItens) {
                System.out.println(item);
            }
        }
    }
}
