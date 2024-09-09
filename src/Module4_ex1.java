/**
 * Grade Calculator
 * @author hadjitejuco
 * Range value
 *  grade >= 90 - A
 *  grade >= 80 - B
 *  grade >= 70 - C
 *  grade >= 60 - D
 *  grade < 60 - F
 * https://java-teacher.com/gr-11-netbeans-shortcuts/
 */
//psvm+tab
//sout+tab
import java.util.Scanner;
public class Module4_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //prompt 
        System.out.print ("Enter your score: ");
        int score = scanner.nextInt();
        if (score>=90) {
            System.out.println("Grade is A ");
        } else if (score >=80) {
            System.out.println("Grade is B ");
        }else if (score >= 70) {
            System.out.println("Grade is C ");
        }else if (score >=60) {
            System.out.println("Grade is D ");
        }else{
             System.out.println("Grade is F ");
        }
        scanner.close();
    }
}
