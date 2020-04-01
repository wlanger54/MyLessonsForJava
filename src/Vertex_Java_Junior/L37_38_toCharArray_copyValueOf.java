package Vertex_Java_Junior;

//   Урок 37: toCharArray() в Java - Сделать из строки массив чаров
//   Урок 38: copyValueOf() в Java - создать строку из массива чаров






public class L37_38_toCharArray_copyValueOf {

    public static void main(String[] args) {



//   Урок 37: toCharArray() в Java - Сделать из строки массив чаров

// Метод toCharArray() создает из строки массив чаров (от англ. - char).


        String str = "Sergey";
        char[] result = str.toCharArray();

        System.out.println("Char array:");
        for (int x = 0; x < result.length; x++)
            System.out.println("Element [" + x + "]: " + result[x] );



//   Урок 38: copyValueOf() в Java - создать строку из массива чаров

//        Пример 1 - без параметров:

              System.out.println();

        char[] chars = { 'S', 'e', 'r', 'g', 'e', 'y'};
        String s1 = "String";
        System.out.println("String s1 before copyValueOf:   " +s1);

        s1 = s1.copyValueOf(chars);
        System.out.println("String s1 after copyValueOf:   " +s1);


//        Пример 2 - с параметрами:

                 System.out.println();

        char[] chars2 = {'V', 'e', 'r', 't', 'e', 'x', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        String s5 = "String";

        String s10 = s5.copyValueOf(chars2);
        String s11 = s5.copyValueOf(chars2, 2 , 7);
        System.out.println("String without offset:                 " + s10);
        System.out.println("String with offset 2 and length 7:     " + s11);








    }
}
