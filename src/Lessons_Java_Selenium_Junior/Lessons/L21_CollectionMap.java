package Lessons_Java_Selenium_Junior.Lessons;


// Колекция Map  - Хранит в себе 2 значения Key и Value.


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class L21_CollectionMap {


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Green");
        map.put(10, "Yellow");

        System.out.println(map.get(1));
        System.out.println(map.get(10));

/////
        // Метод Clear + Метод Size

        Map<Integer, String> map1 = new HashMap<>();

        map1.put(10, "Black");
        map1.put(20, "White");
        map1.put(30, "Green");

        System.out.println();
        System.out.println(map1.get(10));
        System.out.println(map1.get(20));
        System.out.println(map1.get(30));

        System.out.println();
        System.out.println(map1.size());  // количнство элементов
        map1.clear();                     // очищаем наши элементы
        System.out.println(map1.size());

/////
         // Метод containsKey - позволяет проверить наличие ключа.
         // Метод containsValue - позволяет проверить наличие значения

        Map<Integer, String> map2 = new HashMap<>();

        map2.put(15, "Sergey");
        map2.put(16, "Sasha");
        map2.put(17, "Alex");

        System.out.println();
        System.out.println(map2.containsKey(80));  // Метод containsKey
        System.out.println(map2.containsKey(15));

        System.out.println();
        System.out.println(map2.containsValue("Dima"));  // Метод containsValue
        System.out.println(map2.containsValue("Sergey"));
        System.out.println(map2.containsValue("Alex"));
        System.out.println();

/////
            // Выводим все значения через hasNext

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
         while (iterator.hasNext()){
             System.out.println(map.get(iterator.next()));

         }


/////

        Map<String, String> map3 = new HashMap<>();

        map3.put("Sergey", "Anisimov" );
        map3.put("Barsik", "Kat");

        System.out.println();
        System.out.println(map3.get("Sergey"));
        System.out.println(map3.get("Barsik"));




























    }
}
