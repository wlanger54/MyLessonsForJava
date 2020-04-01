package Lessons_Java_Selenium_Junior.L28_OOP_Nasledovanie;

// Урок 28  Принцип ООП : Наследование




public class Nasledovanie {


    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.name = "Rex";
        dog.color = "Black";
        dog.weight = 15;

        dog.walk("On the street");
        dog.sit();


        System.out.println("Dog name is: " + dog.name);
        System.out.println("Dog color is: " + dog.color);
        System.out.println("Dog weight is: " + dog.weight);


        System.out.println();

        cat.name = "Matroskin";
        cat.color = "White";
        cat.weight = 10;

        cat.sleep();
        cat.CatPlay();
        cat.CatSay();
        cat.walk("at home");

        System.out.println("Cat name is: " + cat.name);
        System.out.println("Cat color is: " + cat.color);
        System.out.println("Cat weight is: " + cat.weight);





    }
}
