
package TN28_Module9;


import java.util.LinkedList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phone;

    public Contact (String name, String phone) {
        this.name = name;
        this.phone = phone;
        
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    @Override
    public String toString(){
        return "Contact[Name: "+name+ ", Phone "+phone+"]";
    }
    
}

public class ContactManagerLinkedList {
    public static void main(String[] args) {
        LinkedList<Contact> contacts = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
        
            System.out.println("\nContact Manager (LinkedList)");
            System.out.println("1. Add Contact at beginning ");
            System.out.println("2. Add Contact at end ");
            System.out.println("3. Remove First contact ");
            System.out.println("4. Remove last contact ");
            System.out.println("5. View ");
            System.out.println("6. Exit ");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter contact name: ");
                    String nameFirst = scanner.nextLine();
                    System.out.print("Enter contact Phone Number: ");
                    String phoneFirst = scanner.nextLine();
                    contacts.addFirst(new Contact (nameFirst,phoneFirst));
                    System.out.println("Contact added at the beginning.");
                    break;
                case 2:
                    System.out.print("Enter contact name: ");
                    String nameLast = scanner.nextLine();
                    System.out.print("Enter contact Phone Number: ");
                    String phoneLast = scanner.nextLine();
                    contacts.addLast(new Contact (nameLast,phoneLast));
                    System.out.println("Contact added at the end.");
                    break;
                case 3:
                    if (!contacts.isEmpty()){
                        Contact removedFirst = contacts.removeFirst();
                        System.out.println("Remove First contact "+removedFirst);
                    }else{
                        System.out.println("No contact to remove ");
                    
                    }
                    break;
                case 4:
                    if (!contacts.isEmpty()){
                        Contact removedLast = contacts.removeLast();
                        System.out.println("Remove last contact "+removedLast);
                    }else{
                        System.out.println("No contact to remove ");
                    
                    }
                    break;
                case 5:
                    if (!contacts.isEmpty()){
                        System.out.println("List of Contacts ");
                        for (Contact contact : contacts ){
                            System.out.println(contact);
                        }
                    }else{
                        System.out.println("No contact found ");
                    }
                    break;
                case 6:
                    System.out.println("Exit program");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Option ");
                    break;
            
            
            
            }
            
        }
        
    }
}
