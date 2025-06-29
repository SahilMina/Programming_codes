import java.util.Scanner;
interface Animal{
    public void animalSound();
    public void animalActivity();
}
class Cat implements Animal{
    public void animalSound(){
        System.out.println("Cat Sound : Meow");
    }
    public void animalActivity(){
        System.out.println("Cat Sleep's and eat's all day");
    }
}

class Dog implements Animal{
    public void animalSound(){
        System.out.println("Dog Sound : Bark");
    }
    public void animalActivity(){
        System.out.println("Dog is loyal and it guard's the house");
    }
}
        
public class Q86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice (1:-Cat & 2:-Dog)");
        int choice = input.nextInt();        
        Cat cat = new Cat();
        Dog dog = new Dog();
        if(choice == 1){
            cat.animalSound();
            cat.animalActivity();
            
        }
        else{
            dog.animalSound();
            dog.animalActivity();
        }
    input.close();

    }
}
