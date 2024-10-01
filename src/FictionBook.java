 
public class FictionBook extends Book{
    private String genre;
    
    public FictionBook(String title, String author, String genre){
        super(title, author);
        this.genre = genre;

    }   
    
     //displau info
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Genre "+genre);
    
    }
    
}
