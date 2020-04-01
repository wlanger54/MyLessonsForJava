package Vertex_Java_Junior;

//Урок 63: Что такое ArrayList в Java


import java.util.ArrayList;

public class L63_ArrayList {

    public static void main(String[] args) {


        ArrayList <String> Cities = new ArrayList<>();

        Cities.add("Odessa");
        Cities.add("Kiev");
        Cities.add("Nikolaev");
        Cities.add("Lviv");
        Cities.add("Balawiha");

        Cities.add(2, "Gandyras");     // Добовляем элемент в список


        System.out.println(Cities.size());            // Выводим размер\количество элементов нашего спика
        System.out.println(Cities);                   // Выводит какие элементы есть в нашем списке
        System.out.println(Cities.get(3));           //   Выводим элемент под индексом 3 - Nikolaev

/////

        Cities.get(3);  //Nikolaev                   // что бы обратиться  к элементу под индексом (3)
        String element = Cities.get(3);

        System.out.println();
        System.out.println(element);

/////

        System.out.println();                            // Выводит индекс определенного элемента
        System.out.println(Cities.indexOf("Odessa"));    // 0
        System.out.println(Cities.indexOf("Lviv"));      // 4
        System.out.println(Cities.indexOf("Afrika"));    // -1    так ка этого элемента нет в списке

/////
        Cities.set(1, "London");                        // Заменяет элемент

        System.out.println();
        System.out.println(Cities.get(1));      // Заменяет элемент . Папример : Kiev на London


/////    Удаление !!!!

        Cities.remove(5);    // Удалит по индексу
        Cities.remove("Odessa");  // Удалит по элементу

        System.out.println();
        System.out.println(Cities);

        Cities.clear();              // Удалит все !!

        System.out.println();
        System.out.println(Cities);




    }
}


