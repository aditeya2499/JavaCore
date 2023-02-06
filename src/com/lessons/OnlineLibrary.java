package com.lessons;

import java.util.Scanner;

class Library {
    public String[] getAvailableBooks() {
        return AvailableBooks;
    }

    public void setAvailableBooks(String[] availableBooks) {
        AvailableBooks = availableBooks;
    }

    public String[] getIssuedBooks() {
        return IssuedBooks;
    }

    public void setIssuedBooks(String[] issuedBooks) {
        IssuedBooks = issuedBooks;
    }

    String AvailableBooks[] = new String[999];
    String IssuedBooks[] = new String[999];

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for(int i=0;i<999;i++) {
            if(AvailableBooks[i] == null) {
                AvailableBooks[i] = name;
                break;
            }
        }
    }

    public void issueBook(String book) {
        for(int i=0;i<999;i++) {
            if(this.AvailableBooks[i].equals(book)) {
                System.out.println("the book has been added");
                this.AvailableBooks[i] = null;
                return;
            }
        }
    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.AvailableBooks) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void returnBook() {
        addBook();
    }

}

public class OnlineLibrary {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.addBook();
        l1.addBook();
        l1.addBook();
        l1.showAvailableBooks();
        l1.issueBook("a");
        l1.showAvailableBooks();
        l1.returnBook();
        l1.showAvailableBooks();



    }
}
