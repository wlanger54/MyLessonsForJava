package Lessons_Java_Selenium_Junior.L32_Interface;

public class Plane implements Transport {

    @Override
    public void go() {
        System.out.println("We are flying on a Plane");
    }

    @Override
    public void stop() {
        System.out.println("We are landing !");
    }

    public void setHeight(int height) {
        System.out.println("Our height is: " + height);
    }


}
