import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        //create a array to save book information
        ArrayList<Book> array = new ArrayList<Book>();
        while (true){
            System.out.println("---------Welcome to Library manage system----------");
            System.out.println("1.add book");
            System.out.println("2.delete book");
            System.out.println("3.change book");
            System.out.println("4.view all books");
            System.out.println("5.find book");
            System.out.println("6.quit");
            System.out.println("type in number");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch(line) {
                case "1":
                    System.out.println("add book");
                    addBook(array);
                    break;
                case "2":
                    System.out.println("delete book");
                    deleteBook(array);
                    break;

                case "3":
                    System.out.println("change book");
                    break;
                case "4":
                    System.out.println("view all books");
                    break;

                case "5":
                    System.out.println("find book");
                    break;
                case "6":
                    System.out.println("thank you for using");
                    break;
            }
        }
    }
    //make a method to add book information
    public static void addBook(ArrayList<Book> array){
        Scanner sc = new Scanner(System.in);

        System.out.println("type in book id");
        String bid = sc.nextLine();
        System.out.println("type in book name");
        String name = sc.nextLine();
        System.out.println("type in  number of books");
        String number = sc.nextLine();
        System.out.println("type in position of book");
        String position = sc.nextLine();

        //create a book
        Book b = new Book();
        b.setBid(bid);
        b.setName(name);
        b.setNumber(number);
        b.setPosition(position);

        //add b to the array
        array.add(b);

        System.out.println("add completely");
    }

    //make method to delete book
    public static void deleteBook(ArrayList<Book> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("type in id of the book you want to delete");
        String bid = sc.nextLine();
        //search all books and find the number and delete
        int ass = -123;
        for(int i=0;i<array.size();i++){
            Book b  = array.get(i);
            if(b.getBid().equals(bid)){
                ass = i;
                break;
            }

        }
        if(ass == -123){
            System.out.println("book id not found");

        }else{array.remove(ass);
            System.out.println("delete completely");
        }
    }

    //make method to show book information
    public static void viewBook(ArrayList<Book> array){
        //  /t means tab
        System.out.println("id");
    }

    public static void changeBook(ArrayList<Book> array){

    }

    // make method to find book
    public static void findBook(ArrayList<Book> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("type in id of the book you want to find");
        String bid = sc.nextLine();
        int asshole = -13;
        for(int i=0;i<array.size();i++){
            Book c  = array.get(i);
            if(c.getBid().equals(bid)){
                asshole = i;
                break;
            }

        }
        if(asshole == -13){
            System.out.println("book id not found");

        }else{
        }

    }



}
