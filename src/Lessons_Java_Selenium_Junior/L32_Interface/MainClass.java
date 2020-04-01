package Lessons_Java_Selenium_Junior.L32_Interface;

public class MainClass {

    public static void main(String[] args) {

        Car BMW = new Car();
        Plane Ant = new Plane();

        BMW.go();
        BMW.stop();
        BMW.setSpeed(50);

        Ant.go();
        Ant.stop();
        Ant.setHeight(2000);



    }
}
