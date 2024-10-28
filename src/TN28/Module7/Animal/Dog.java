
package TN28.Module7.Animal;

//subclass (inherit the Animal)
public class Dog extends Animal {
    //Providing Implementation for the abstract method
    @Override
    void makeSound(){
        System.out.println("Woof");
    }
}
