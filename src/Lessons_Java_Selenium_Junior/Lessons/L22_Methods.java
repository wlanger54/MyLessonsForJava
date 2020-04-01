package Lessons_Java_Selenium_Junior.Lessons;



// Методы

public class L22_Methods {



     public static void main(String[] args) {


        int a = 13;
        int b = 5;
        int sum;

        sum = getSum(a, b);
        System.out.println(sum);
        sum = getSum(10, 25); // переписали значение
        System.out.println(sum);
        System.out.println(getSum(33, 33));   // Переписали значение пример 2 .
         System.out.println();


         showSum(10, 20, 30);  // название метода

         sayFIO();  // название метода

         sayHello("Sergey");
         String name = "Vasya";   // 2й вариант вывода
         sayHello(name);

         showSumSayHello("Alex", 25, 35, 45);
    }


     static int getSum (int x , int y) {
        int sum;
        sum = x + y;
        return sum;
    }

/////

     static void showSum (int x, int y, int z) {
         int sum = x + y + z;
         System.out.println("Sum is " + sum);
     }

/////

     static void  sayFIO(){
         System.out.println();
         System.out.println("Sergey");
         System.out.println("Anisimov");
         System.out.println("1986");
     }

/////

     static  void  sayHello(String name){
         System.out.println();
         System.out.println("Hello " + name + "!");
         System.out.println("I'm you program!");
         System.out.println("Nice to meet you!");
     }

/////

      // метод внутри метода

     static void showSumSayHello(String name, int a, int b, int c) {
         sayHello(name);
         showSum(a, b, c);
         System.out.println("End of program");

     }





}
