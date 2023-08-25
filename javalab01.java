import java.util.ArrayList;
import java.util.Scanner;

// Interface para definir métodos comuns para todos os tipos de itens da biblioteca
interface LibraryItem {
    String getTitle();
    void setTitle(String title);
}

// Classe de Livro que implementa LibraryItem
class Book implements LibraryItem {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

// Classe de Biblioteca para gerenciar livros
class Library {
    private ArrayList<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        this.items.add(item);
    }

    public void removeItem(LibraryItem item) {
        this.items.remove(item);
    }

    public void listItems() {
        for (LibraryItem item : items) {
            System.out.println("Título: " + item.getTitle());
        }
    }
}

// Classe principal
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Remover livro");
            System.out.println("3. Listar livros");
            System.out.println("4. Sair");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha deixada pelo método nextInt()

            switch (option) {
                case 1:
                    System.out.println("Digite o título do livro para adicionar:");
                    String titleToAdd = scanner.nextLine();
                    library.addItem(new Book(titleToAdd));
                    break;

                case 2:
                    System.out.println("Digite o título do livro para remover:");
                    String titleToRemove = scanner.nextLine();
                    library.removeItem(new Book(titleToRemove));
                    break;

                case 3:
                    System.out.println("Lista de livros:");
                    library.listItems();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
