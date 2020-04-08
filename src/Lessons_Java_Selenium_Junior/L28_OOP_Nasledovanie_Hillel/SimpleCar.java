package Lessons_Java_Selenium_Junior.L28_OOP_Nasledovanie_Hillel;

public class SimpleCar extends Car {


    public SimpleCar(String name, String color, String year, int weight) {              // наследовали явный конструктор
        super(name, color, year, weight);
    }

    @Override
    public void go() {
        System.out.println("Я обычная  машину и я еду спокойно !");
    }


}
