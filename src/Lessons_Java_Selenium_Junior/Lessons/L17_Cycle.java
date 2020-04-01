package Lessons_Java_Selenium_Junior.Lessons;


// ЦИКЛЫ

public class L17_Cycle {


    public static void main(String[] args) {


        System.out.println("Start program");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

        System.out.println("End program");
        System.out.println();

/////

        for (int i = 0; i < 5; i++) {    // + умножение
            System.out.println(i * 5);
        }
            System.out.println();

/////

         for (int i = 10; i > 0; i--) {   // обратный отсчет
             System.out.println(i);
         }

/////

        int[] array = new int [10];  //  массив
        System.out.println();
        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
            System.out.println("Element with index " + i + " is " + array[i]);
        }

/////

     // Цикл While

        System.out.println();

        int i = 0;
        while (i < 10) {
            System.out.println("While " + i);
            i++;
        }

/////

        System.out.println();  // while + boolean

        int x = 0;
        boolean bool = true;
        while (bool){
            System.out.println("True: " + x);
            x++;
            if (x == 5) bool = false;
        }

/////

        System.out.println();

        i = 5;  //  do while  сначала выполняем действие потом совершаем проверку !
        do {
            System.out.println("Do: " + i);
            i++;
        }
        while (i < 5);













    }
}
