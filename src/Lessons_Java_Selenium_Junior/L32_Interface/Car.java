package Lessons_Java_Selenium_Junior.L32_Interface;



public class Car implements Transport {

    @Override
    public void go() {
        System.out.println("We are driving !");
    }

    @Override
    public void stop() {
        System.out.println("We are stop !");
    }

    public void setSpeed(int speed) {
        System.out.println("Our speed is: " + speed);
    }






}
