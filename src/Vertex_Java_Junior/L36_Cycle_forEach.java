package Vertex_Java_Junior;

// Урок 36: Цикл for each


import java.util.ArrayList;

public class L36_Cycle_forEach {

    public static void main(String[] args) {


// Задача-1
// Решение с помощью цикла For


    int[] fo = {10, 15, 35};

    for (int r = 0; r < fo.length; r++){
        System.out.println(fo[r]);
    }


// Решение с помощью цикла for each !!!

        System.out.println();

    int[] fo2 = {55, 79, 115};

    for (int x : fo2) {
        System.out.println(x);
    }


// Задача-2
// 1.Решение с помощью цикла for

        System.out.println();

     ArrayList<Integer> list = new ArrayList<>();
     list.add(50);
     list.add(75);
     list.add(433);

    for (int a = 0; a < list.size(); a++) {
         System.out.println(list.get(a));
    }


// 2.Решение с помощью цикла for each !!!!

        System.out.println();

     ArrayList<Integer> list2 = new ArrayList<>();

     list2.add(100);
     list2.add(122);
     list2.add(170);

        for (Integer z:list2) {
            System.out.println(z);

        }











    }
}
