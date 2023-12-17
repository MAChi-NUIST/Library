import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        //create a array to save book information
        ArrayList<Book> array = new ArrayList<Book>();
      circle:  while (true){
            System.out.println("---------Welcome to Library manage system----------");
            System.out.println("1.add book");
            System.out.println("2.delete book");
            System.out.println("3.change book");
            System.out.println("4.view all books");
            System.out.println("5.quit");
            System.out.println("type in number");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch(line) {
                case "1":
                    System.out.println("add book");
                    addBook(array);
                    break ;

                case "2":
                    System.out.println("delete book");
                    deleteBook(array);
                    break ;


                case "3":
                    System.out.println("change book");
                    changeBook(array);
                    break;

                case "4":
                    System.out.println("view all books");
                    viewBook(array);
                    break ;

                case "5":
                    System.out.println("thank you for using");
                    break circle;

                default:System.out.println("inout error");
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
        Integer number = sc.nextInt();
        System.out.println("type in position of book");
        String position = sc.nextLine();
        System.out.println("type in 'yes' or 'no' to show  the book can be borrowed or not");
        String availability = sc.nextLine();
        //create a book
        Book b = new Book();
        b.setBid(bid);
        b.setName(name);
        b.setNumber(String.valueOf(number));
        b.setPosition(position);
        b.setAvailability(availability);



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

    //make method to show all book information
    public static void viewBook(ArrayList<Book> array){
        //make method to list all books
        System.out.println("bid\t\tname\tnumber\tposition\tavailability");
        for (int i = 0; i < array.size(); i++) {
            Book b = array.get(i);
            System.out.println(b.getBid() + "\t" + b.getName() + "\t"+ b.getNumber() + "\t" +b.getPosition() + "\t" + b.getAvailability());


        }
        }
        //make method to change book information

    public static void changeBook(ArrayList<Book> array){
        Scanner sc =new Scanner(System.in);
        System.out.println("type in the book id you want to change");
        String bid =sc.nextLine();
        int index =getIndex(array,bid);
        if (index==-1){System.out.println("the id is not existed");
        return;
        }

        Book b = array.get(index);

        System.out.println("type in the book name you want to change");
        String newName = sc.nextLine();
        b.setName(newName);
        System.out.println("type in the book number you want to change");
        Integer newNumber = Integer.valueOf(sc.nextLine());
        b.setNumber(String.valueOf(newNumber));
        System.out.println("type in the book position you want to change");
        String newPosition = sc.nextLine();
        b.setPosition(newPosition);
        System.out.println("type in the book availability you want to change");
        String newAvailability = sc.nextLine();
        b.setAvailability(newAvailability);
        System.out.println("The book has been changed");


    }

    public static int getIndex(ArrayList<Book> array,String bid){
        for (int i= 0;i<array.size();i++){
            Book b = array.get(i);
            bid = b.getBid();
            if (bid.equals(bid)){
                return i;
            }


        }
        return -1;

    }


}
