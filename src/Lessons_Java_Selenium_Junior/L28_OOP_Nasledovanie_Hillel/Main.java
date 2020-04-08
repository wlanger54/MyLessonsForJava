package Lessons_Java_Selenium_Junior.L28_OOP_Nasledovanie_Hillel;

public class Main {

    public static void main(String[] args) {


        SportCar car1 = new SportCar("BMW", "Black", "2000",2);   // Используем явный конструктор
        SimpleCar car2 = new SimpleCar("Ford","Red","2010", 1);


//        car1.setName("BMW");            // тут используеться не явный конструктор
//        car1.setColor("Black");
//        car1.setYear("2000");
//        car1.setWeight(2);

//        car2.setName("Ford");
//        car2.setColor("Red");
//        car2.setYear("2010");
//        car2.setWeight(2);


        optionsMyCars(car1);
        optionsMyCars(car2);

        functionalMyCar(car1);
        functionalMyCar(car2);

    }


    public static void optionsMyCars(Car myCars){                              // Этими методами избегаем дублирование методов для каждого обьекта
        System.out.println("Модель: " + myCars.getName());
        System.out.println("Цвет: " + myCars.getColor());
        System.out.println("Год выпуска: " + myCars.getYear());
        System.out.println("Вес: " + myCars.getWeight());

    }


    public static void functionalMyCar(Car car) {
        car.go();
        car.stop();
        car.refuel();
    }





}
