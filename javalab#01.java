import java.until.ArrayList;
import java.until.Scanner;

// Interface para definir métodos comuns para todos os tipos de itens da biblioteca
interface LibraryItem {
    String getTitle();
    void setTitle(String title);
}

// Classe de livro que implementa LibraryItem
class Book implements LibraryItem {
    private String title;

    public Book(String title) 
}