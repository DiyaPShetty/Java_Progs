package library;

import java.util.ArrayList;
import java.util.Scanner;
//public class library

public class Library {
    private ArrayList<Book> books;
//creating a array
    public Library() {
        books = new ArrayList<>();
    }
//adding books
    public void Bookadd(String id, String title, String author) {
        books.add(new Book(id, title, author));
    }
//issue books
    public boolean issueBook(String id) {
        for (Book b : books) {
            if (b.getId().equals(id) && !b.isIssued()) {
                b.issue();
                return true;
            }
        }
        return false;
    }
//delete book
    public boolean deleteBook(String id) {
        return books.removeIf(b -> b.getId().equals(id));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
//display book
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    // Main method for user input
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lib.Bookadd(id, title, author);
                    System.out.println("Book added!");
                    break;

                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    String issueId = sc.nextLine();
                    if (lib.issueBook(issueId)) {
                        System.out.println("Book issued!");
                    } else {
                        System.out.println("Book not found or already issued.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to delete: ");
                    String delId = sc.nextLine();
                    if (lib.deleteBook(delId)) {
                        System.out.println("Book deleted!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    lib.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

