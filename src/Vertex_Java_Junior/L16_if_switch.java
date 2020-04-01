package Vertex_Java_Junior;


// Урок 16: Условный оператор if в Java. Оператор switch


import java.util.Scanner;

public class L16_if_switch {

    public static void main(String[] args) {



// Задача-1

        System.out.println("Введите число 1, 2, или 3: ");

        Scanner rex = new Scanner(System.in);
        int one = rex.nextInt();

        if (one == 1) {
            System.out.println("Вы ввели число 1");
        }
        else if (one == 2) {
            System.out.println("Вы ввели число 2");
        }
        else if (one == 3) {
            System.out.println("Вы ввели число 3");
        }
        else {
            System.out.println("Вы ввели не верное число !!!");
        }


// Задача-2

        System.out.println();
        System.out.println("Нажмите цифру 1 ");

        Scanner rex2 = new Scanner(System.in);
        int two = rex2.nextInt();

        if (two == 1) {
            System.out.println("Вы нажали цифру 1");
        }
        else {
            System.out.println("Вы нажали другую цифру!");
        }


// Задача-3

        System.out.println();
        System.out.println("Введите число 1: ");

        Scanner rex3 = new Scanner(System.in);
        int three = rex3.nextInt();

        if (three == 1) {
            System.out.println("Вы ввели число 1");
        }



// Задача-4  Оператор switch

        System.out.println();
        System.out.println("Введите 1, 2, 3, или 4");

        Scanner swi = new Scanner(System.in);
        int number = swi.nextInt();

        switch (number) {
            case 1: System.out.println("Вы ввели число 1"); break;
            case 2: System.out.println("Вы ввели число 2"); break;
            case 3: System.out.println("Вы ввели число 3"); break;
            case 4: System.out.println("Вы ввели число 4"); break;
            default: System.out.println("Вы ввели непраильное число !!!");
        }











    }
}
