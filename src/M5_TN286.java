/**
 *
 * @author hadjitejuco
 */
public class M5_TN286 {
    String name;
    int[] grades;
    
    //constructor
    public M5_TN286(String name, int[] grades){
        this.name = name;
        this.grades = grades;
    }
    
    public void displayAverage(){
        int total = 0;
        for (int grade : grades){
            total += grade;
        }      
        double average = (double)total/grades.length;
        System.out.println("------------------");
        System.out.println("Student "+name);
        System.out.println("Average "+average);
        System.out.println("------------------");
    }
    
    
    
}
