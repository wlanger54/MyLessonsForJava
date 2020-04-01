package Lessons_Java_Selenium_Junior.L28_OOP_Nasledovanie;



public class Cat extends Animal {



    public void CatSay () {

        System.out.println("Meow ");
    }


    public void CatPlay () {
        System.out.println("I am crazy Cat ))");
    }


    @Override                                     //  Переделал метод класса-родителя.
    public void walk (String place) {
        System.out.println("I am run " + place);
    }

    @Override
    public void sleep() {
        super.sleep();                              // Добовляем или дописываем что то в родительскую строку
        System.out.println("i am sleep");
    }
}
