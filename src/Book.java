//superclass    
public class Book {
    
    protected String title;
    protected String author;
    protected boolean available;
    
    //constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.available = true;
    
    }
    //BorrowBook
    public void borrowBook(){
        if (available){
            available = false;
            System.out.println(title + " has been borrowed ");
        }else{
            System.out.println(title + " is not available");
        }
    }
    //return
    public void returnbook(){
        available = true;
        System.out.println(title + " has been returned ");
    
    }
    
    //displau info
    public void displayInfo(){
        System.out.println("Title "+title);
        System.out.println("Author "+author);
        System.out.println("Available "+available);
    
    }
    
    
}
