package Lessons_Java_Selenium_Junior.L25_Classes_and_Objects;

//  Урок 25.  Классы и Объекты


public class Classes_and_Objects {


    public static void main(String[] args) {


        Car Toyota = new Car();

        Toyota.color = "Black";
        Toyota.lenght = 5000;
        Toyota.height = 2000;
        Toyota.width = 2000;

        Toyota.addWeight(50);           // Добавили вес к общему весу
        Toyota.drive(120);       // Установили скорость с которой едет машина

        Toyota.addWeight(700);          // Поменяли значения
        Toyota.drive(100);


/////
        Car BMW = new Car();         // Создаем новые обьекты на основе одного класса

        BMW.color = "White";

        BMW.drive(120);
        BMW.addWeight(100);

/////

        Car Mercedes = new Car();

        Mercedes.color = "Red";

        Mercedes.drive(150);
        Mercedes.addWeight(120);














    }
}
