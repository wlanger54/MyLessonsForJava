package Vertex_Java_Junior;


// Сканер

import java.util.Scanner;
import java.util.SortedMap;

// ?????????????????????????????????????
public class L14_Scanner {


    public static void main(String[] args) {



// Example-1  C методом nextInt ()

        System.out.println("Введите любое число от 1 до 10: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println("Вы ввели число " + number);


// Example-2  C методом nextInt ()

        System.out.println();
        System.out.println("Введите 2 любых числа: ");

        Scanner k = new Scanner(System.in);
        int number1 = k.nextInt();   //считывает первое число и присваивает значение в number1
        int number2 = k.nextInt();   //считывает второе число и присваивает значение в number2

        System.out.println(number1 + number2);


// Example-3  с методом nextLine ()

        System.out.println();
        System.out.println("Введите любое слово или фразу: ");

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println( "Вы ввели слово: " + word);


// Example-4  с методом nextLine ()

        System.out.println();
        System.out.println("Введите любые 2 слова или фразу: ");

        Scanner sc2 = new Scanner(System.in);
        String word1 = sc2.nextLine();
        String word2 = sc2.nextLine();

        System.out.println(word1 + " " + word2);


// Example-5  с методом next () - Выводит все до первого пробела

        System.out.println();
        System.out.println("Введите любое слово или фразу: ");

        Scanner sc5 = new Scanner(System.in);
        String phrase = sc5.next();

        System.out.println(phrase);


// Example-6  с методом nextDouble ()

        System.out.println();
        System.out.println("Введите любое дробное число: ");

        Scanner sc6 = new Scanner(System.in);
        double number6 = sc6.nextDouble();

        System.out.println("Вы введи дробное число: " + number6);





























    }
}
