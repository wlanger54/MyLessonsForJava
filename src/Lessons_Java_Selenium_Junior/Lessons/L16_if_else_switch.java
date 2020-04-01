package Lessons_Java_Selenium_Junior.Lessons;


// Условия и множественный выбор

import java.util.SortedMap;

public class L16_if_else_switch {

    public static void main(String[] args) {


        int i = 10;

        System.out.println("Start of program");

        if (i > 10) {
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }
        else if (i < 10 && i > 5) {
            System.out.println("i < 10 && i > 5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }

        System.out.println("End of program");
        System.out.println();


/////

        i = 40;

        if (i > 50) {
            System.out.println("i > 50");
            if (i > 90) {
                System.out.println("i > 90");
            }
            else {
                System.out.println("i <=90");
            }
        }
        else  {
            System.out.println("i <=50");
            System.out.println();
            }

/////

        i = 2;

        switch (i) {
            case 1:
                System.out.println("The number is 1"); break;
            case 2:
                System.out.println("The number is 2"); break;
            case 3:
                System.out.println("the number is 3"); break;
            default:
                System.out.println("i don't know is number !");
        }






    }
}
