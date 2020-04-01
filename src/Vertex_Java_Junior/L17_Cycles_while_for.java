package Vertex_Java_Junior;


// Урок 17: Что такое циклы в Java? И какие есть виды циклов?





public class L17_Cycles_while_for {


    public static void main(String[] args) {



// Задача-1        Необходимо вывести на экран числа от 1 до 7. То есть на экране должно быть: 1 2 3 4 5 6 7

        int i = 1;
        while (i < 8) {
            System.out.print(i + " " );
            i++;
        }


// Задача-2    Это пример так называемого бесконечного цикла, потому что числа будут выводить до бесконечности

/*        int x = 1;
        while (true) {
            System.out.print(x + " ");
            x++;
        }

 */


// Задача-3    Необходимо вывести на экран вот такую последовательность чисел: 100 90 80 70 60 50 40 30 20 10

        System.out.println();

        int y = 100;
        while (y >= 10) {
            System.out.print(y + " ");
            y = (y - 10);
        }


// Задача-4      код с циклом do…while

        System.out.println();

        int d = 1;
        do {
            d++;
            System.out.println(d + " ");
        } while (d < 0);


// Задача-5   Цикл for

        System.out.println();

        for (int f = 1; f <= 5; f++) {
            System.out.println("Privet ");
        }


// Задача-4      Необходимо вывести на экран числа от 3 до -3. То есть на экране должно быть: 3 2 1 0 -1 -2 -3


        System.out.println();

        for (int r = 3; r >= -3; r--) {
            System.out.print(r + " ");
        }



























    }
}
