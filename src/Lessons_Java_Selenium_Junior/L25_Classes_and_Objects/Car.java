package Lessons_Java_Selenium_Junior.L25_Classes_and_Objects;

// Относиться к уроку 25 .  Это класс Car для урока 25



public class Car {

    int height;
    int width;
    int lenght;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight (int weight) {
        this.weight += weight;
        System.out.println("New weight: " + this.weight);
    }


    public void drive (int speed) {
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("We are driving !");
        } else {
            System.out.println("Cannot drive!!!");
        }
    }





}

