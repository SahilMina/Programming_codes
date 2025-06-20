abstract class Animal {
    abstract void makeSound();
}

public class Q84 {
    public static void main(String[] args) {
        Animal obj = new Animal() {
            void makeSound() {
                System.out.println("Anonymous Inner Class: Roar!");
            }
        };
        obj.makeSound();
    }
}
