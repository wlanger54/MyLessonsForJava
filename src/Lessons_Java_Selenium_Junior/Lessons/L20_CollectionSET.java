package Lessons_Java_Selenium_Junior.Lessons;



// Колекция Set .  Set предназначен для хранения уникальных значений


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class L20_CollectionSET {

    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(11);

        System.out.println(set.size());
        System.out.println();

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());   // цикл While
        }

        System.out.println();
        for  (int i : set){
            System.out.println(i);   // цикл for each
        }

/////

        Set<Integer> set1 = new HashSet<>();
        set1.add(21);
        set1.add(22);
        set1.add(23);
        set1.add(24);

        System.out.println();
        System.out.println(set1.size());


        set1.remove(23);   //  Удаляем значение  (Удаляем не индекс а его значение)

        Iterator<Integer> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());   // цикл While
        }


























    }

}
