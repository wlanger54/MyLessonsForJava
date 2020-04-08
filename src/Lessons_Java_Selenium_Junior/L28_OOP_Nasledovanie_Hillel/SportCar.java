package Lessons_Java_Selenium_Junior.L28_OOP_Nasledovanie_Hillel;

public class SportCar extends Car{

    public SportCar(String name, String color, String year, int weight) {     // наследовали явный конструктор
        super(name, color, year, weight);
    }

    @Override
    public void go() {
        System.out.println("Я спортивная машину и я быстро еду !");
    }




}
