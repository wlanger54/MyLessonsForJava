package Vertex_Java_Junior;




//   Задачи на циклы  For


import java.util.Scanner;

public class L18_Cycles_for {


    public static void main(String[] args) {



// Задача-1
// Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5

        for (int q = 1 ; q <= 5; q++) {
            System.out.print(q + " ");
        }


// Задача-2
// Необходимо вывести на экран числа от 5 до 1. На экране должно быть:  5 4 3 2 1

        System.out.println();

        for (int w = 6; w >= 1; w--) {
            System.out.print(w + " ");
        }


// Задача-3
// Необходимо вывести на экран таблицу умножения на 3:

        System.out.println();

        for (int r = 1; r <= 10; r++) {
            System.out.println("3*" + r + "=" + 3*r );
        }


// Задача-4
// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

        System.out.println();

        System.out.println("Введите любое целое положительное число: ");

        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        int sum = 0;
        for (int t = 1; t <= s; t++) {
            sum = sum + t;
        }
        System.out.println(sum);






    }
}
