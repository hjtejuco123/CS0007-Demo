import java.util.Scanner;
public class MainLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of books: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); //clear buffer
        FictionBook[] books = new FictionBook[numBooks];
        
        for (int i = 0; i < numBooks; i++) {
            System.out.print("Book Title: ");
            String title = scanner.nextLine();
            
            System.out.print("Enter Author: ");
            String author = scanner.nextLine();
            
            System.out.print("Enter Genre: ");
            String genre = scanner.nextLine();
            
            books[i] = new FictionBook(title, author, genre);
            
        }
        System.out.println("Library Books");
        for(FictionBook book: books){
            book.displayInfo();
        }
        
        //direct access to the methods
        //[0] pertains to the first element 
        books[0].borrowBook();
        books[0].returnbook();
        books[0].displayInfo();
        
        scanner.close();
        
    }
}
