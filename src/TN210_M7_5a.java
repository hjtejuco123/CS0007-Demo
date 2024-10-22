//subclass
//Manager
public class TN210_M7_5a extends TN210_M7_5 {
    @Override
    public void displayInfo(String[] info){
        System.out.println("Child: Managers Information");
        for (String s: info){
            System.out.println(s);
        }
    }
}
