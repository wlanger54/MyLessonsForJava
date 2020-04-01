package Lessons_Java_Selenium_Junior.L31_ObstractClass;



public abstract class Animal {

    public abstract void saySmth ();
    public abstract void eat ();

    public void walk (String place) {
        System.out.println("I am walking " + place);
    }


}
