import java.util.Scanner;
//Main Class
public class TN210_M7_5_Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //input information
        System.out.println("Input Information");
        String[] empInfo = new String[2];
        for (int i = 0; i < empInfo.length; i++) {
            empInfo[i]= scanner.nextLine();
        }
        
        System.out.println("Input Information");
        String[] mgrInfo = new String[2];
        for (int i = 0; i < mgrInfo.length; i++) {
            mgrInfo[i]= scanner.nextLine();
        }
        
        
        
       TN210_M7_5 emp = new TN210_M7_5();
       TN210_M7_5a mgr = new TN210_M7_5a();
       
       emp.displayInfo(empInfo);
       mgr.displayInfo(mgrInfo);
        
        
    }
}
