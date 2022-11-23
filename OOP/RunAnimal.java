import java.util.Scanner;


class RunAnimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose an animal. Press B for bird, Press C for cat, or D for dog: ");
        String choose = sc.nextLine();

        if(choose.equalsIgnoreCase("B")){
            Bird bird = new Bird();
            bird.eat();
            bird.sleep();
            bird.makeSound();
        }
        else if(choose.equalsIgnoreCase("C")){
            Cat cat = new Cat();
            cat.eat();
            cat.sleep();
            cat.makeSound();
        }
        else if(choose.equalsIgnoreCase("D")){
            Dog dog = new Dog();
            dog.eat();
            dog.sleep();
            dog.makeSound();
        }
        else{
            System.out.println("Invalid input po");
        }
        sc.close();
    
    }

}