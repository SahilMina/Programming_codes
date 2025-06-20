interface Animal {
  public void animalSound();

  public void animalActivity();
}

class Cat implements Animal {
  public void animalSound() {
    System.out.println("The cat says: Meow");
  }

  public void animalActivity() {
    System.out.println("The cat Eat's and sleep's all day");
  }
}

public class Q53 {
  public static void main(String[] args) {
    Cat myCat = new Cat();
    myCat.animalSound();
    myCat.animalActivity();
  }
}