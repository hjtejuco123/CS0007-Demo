/**
 *
 * @author hadjitejuco
 */
public class Main_M5_TN286 {
    public static void main(String[] args) {
        
        int[] hadjiGrades = {80,85,90};
        int[] bobGrades = {85,90,100};
        
        M5_TN286 stud1 = new M5_TN286("Hadji",hadjiGrades);
        M5_TN286 stud2 = new M5_TN286("Bob",bobGrades);
        
        stud1.displayAverage();
        stud2.displayAverage();
        
    }
}
