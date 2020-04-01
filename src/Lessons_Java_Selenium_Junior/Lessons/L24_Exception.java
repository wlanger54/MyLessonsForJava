package Lessons_Java_Selenium_Junior.Lessons;

//  Урок-24  Исключенния






public class L24_Exception {

    public static void main(String[] args) {

        devide (10, 2);   // Делить на ноль нельзя, поэтому будет ошибка

        devide_2 (10, 0);



    }


/////

    public  static  void devide (int a, int b){

        try {
            System.out.println("Result is: " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("Problem !!");
        } finally {
            System.out.println("Finish");
        }
    }



/////


     public static void devide_2 (int a, int b){
        if (b == 0) {
            throw new ArithmeticException ("Cannot devide_2 by zero!");     // Пишет в консоле ошибку
        } else {
            System.out.println("Result is: " + a / b);
        }
     }



}
