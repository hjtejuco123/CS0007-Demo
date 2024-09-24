/**
 * Constructors with arrays
 * @author hadjitejuco
 */
public class M5_TN210_5 {
    //Attributes
    String name;
    int [] grades;
    
    //Constructor
    public M5_TN210_5(String name, int[] grades){
        this.name = name;
        this.grades = grades;
    }
    
    public void displayAverage(){
        int total = 0;
        for(int num:grades){
            total += num;
        }
        double average = (double)total/grades.length;
        System.out.println("Student "+name);
        System.out.println("Average "+average);
    }
    
    public static void main(String[] args) {
        int[] grades = {80,81,83};
        M5_TN210_5 obj1 = new M5_TN210_5 ("Hadji",grades);
        obj1.displayAverage();
    }
    
    
}
