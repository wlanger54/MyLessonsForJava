package Lessons_Java_Selenium_Junior.Lessons;


// Колекция List. + Урок 19 - Итератор

// Метод : add - добовляет ; get - получает значение ; set - меняет значение; remove - удаляет элемент из списка ; size - Выдает размер нашего списка



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L18_CollectionList_Iterator {

    public static void main(String[] args) {



        List<Integer>  list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(25);

        System.out.println(list.get(1));
        System.out.println(list.get(2));

/////

        List<Integer>  list2 = new ArrayList<>();

        list2.add(25);
        list2.add(50);
        list2.add(75);

        int a = list2.get(2);

        System.out.println();
        System.out.println(list2.get(0));
        System.out.println(a);

/////

        // Метод Set - позволяет менят значение

        List<Integer> list3 = new ArrayList<>();

        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.add(400);

        System.out.println();
        System.out.println(list3.get(0));
        System.out.println(list3.get(1));
        System.out.println(list3.get(2));
        System.out.println(list3.get(3));

        list3.set(3, 88);     // Метод Set
        System.out.println();
        System.out.println(list3.get(0));
        System.out.println(list3.get(1));
        System.out.println(list3.get(2));
        System.out.println(list3.get(3));

/////

        //remove  - удаляет элемент из списка.

        List<Integer> list4 = new ArrayList<>();

        list4.add(150);
        list4.add(250);
        list4.add(350);
        list4.add(450);

        System.out.println();
        System.out.println(list4.get(0));
        System.out.println(list4.get(1));
        System.out.println(list4.get(2));
        System.out.println(list4.get(3));

        list4.remove(2);    //remove - удаляет элемент из списка.
        System.out.println();
        System.out.println(list4.get(2));

/////

        // Size - Выдает размер нашего списка

        List<Integer> list5 = new ArrayList<>();

        list5.add(150);
        list5.add(250);
        list5.add(350);
        list5.add(450);

        System.out.println();
        System.out.println(list5.size());  //  Метод Size
        list5.add(600);
        System.out.println(list5.size());

/////

        // clear метод

        List<Integer> list6 = new ArrayList<>();

        list6.add(150);
        list6.add(250);
        list6.add(350);
        list6.add(450);

        System.out.println();
        System.out.println(list6.size());
        list6.clear();    // clear очищает список
        System.out.println(list6.size());



/////

        // добовляем один список в другой

        List<Integer> list7 = new ArrayList<>();

        list7.add(50);
        list7.add(100);

        System.out.println();
        System.out.println(list.size());
        list.addAll(list7);                    // В List добавили List 7
        System.out.println(list.size());

        System.out.println();  // contains - показывает есть ли в нашем списке конкретное значение
        System.out.println(list7.contains(100));
        System.out.println(list7.contains(55));

/////

        // Итератор

        Iterator<Integer> iterator = list.iterator();

        System.out.println();
        System.out.println(iterator.next());     // Итератор выдает значение элементов первого списка
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());   // Проверяет существует ли в списке следующий элемент

/////

        Iterator<Integer> iterator1 = list.iterator();
        System.out.println();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }



























    }


}
