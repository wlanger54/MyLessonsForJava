package Vertex_Java_Junior;

//Урок 19: Задачи на цикл while





public class L19_cycle_while {



    public static void main(String[] args) {



// Задача-1
//Необходимо, чтоб программа выводила на экран вот такую последовательность:  7 14 21 28 35 42 49 56 63 70 77 84 91 98

    int a = 7;
    while (a <= 100) {
            System.out.print(a + " ");
            a = a + 7;
        }


// Задача-2
//Необходимо вывести на консоль такую последовательность чисел: 1 2 4 8 16 32 64 128 256 512


        System.out.println();

    int n = 1;
    while (n <= 512) {
        System.out.print(n + " ");
        n*=2;
    }










    }
}


