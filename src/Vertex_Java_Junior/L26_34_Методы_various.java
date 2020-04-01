package Vertex_Java_Junior;

/*      Урок 26: length() в Java
        Урок 27: concat() в Java
        Урок 28: chartAt() в Java
        Урок 29: substring() в Java
        Урок 30: trim() в Java
        Урок 31: endsWith() в Java
        Урок 32: toUpperCase() в Java - сделать буквы заглавными
        Урок 33: toLowerCase() - сделать буквы строчными
        Урок 34: equals() в Java - проверить равны ли две строки

 */






public class L26_34_Методы_various {

    public static void main(String[] args) {



//        Урок 26: length() в Java
//        Метод length ()  возвращает длину строки.

        String word = " I like Java ";     // = длина строки 13 символов
        System.out.println(word.length());



//        Урок 27: concat() в Java
//        Метод concat() в Java добавляет одну строку в конец к другой строке.

        String con = " У меня есть цель на ближайшие 3 месяца - ";
        con = con.concat("Я должен стать Java разработчиком");
        System.out.println(con);


//        Урок 28: chartAt() в Java
//        chartAt (int index)  - возвращает символ, стоящий на определенном индексе. Напомним, индексы начинаются с 0.

        String sentence = "Обожаю язык программирования Java";
        char ch1 = sentence.charAt(0);
        char ch2 = sentence.charAt(5);
        char ch3 = sentence.charAt(9);
        System.out.println();
        System.out.println("Буква 0 индекса это: " + ch1);
        System.out.println("Буква 5 индекса это: " + ch2);
        System.out.println("Буква 9 индекса это: " + ch3);


//        Урок 29: substring() в Java
//        Обрезает нужные строки

        String sub = "Обожаю язык программирования Java";
        System.out.println();
        System.out.println(sub.substring(6));            // substring(int beginIndex)
        System.out.println(sub.substring(6, 11));        //  substring(int beginIndex, int endIndex)


//        Урок 30: trim() в Java
//        Метод trim() в Java позволяет удалить пробелы в начале и конце строки. Как будто "подрезает" пробелы.

        String tr = "    Java - очень крутой язык программированя.      ";
        String tr2 = "     Java - очень крутой язык программирования.    ";
        System.out.println();
        System.out.println(tr);
        System.out.println(tr2.trim());


//        Урок 31: endsWith() в Java
//        Метод endsWith() определяет, кончается ли строка заданным значением.

        String line = "Sergey Anisimov";
        boolean b1 = line.endsWith("Anisimov");
        boolean b2 = line.endsWith("Pyshkin");
        System.out.println();
        System.out.println("String " + line + "ends with 'Anisimov'?  " + b1);
        System.out.println("String " + line + "end with 'Pyshkin'?  " + b2);


//        Урок 32: toUpperCase() в Java - сделать буквы заглавными
//        Метод toUpperCase() делает все буквы в строке заглавными (например, строка "Vertex" станет строкой "VERTEX").

        String str = "I love Java";
        String res = str.toUpperCase();
        System.out.println();
        System.out.println("Result-1: " + res);

/////

       str = "VERTEX";
       res = str.toUpperCase();
        System.out.println("Result-2: " + res);

/////

        str = "Hello World";
        System.out.println("Result-3: " + str.toUpperCase());


//        Урок 33: toLowerCase() - сделать буквы строчными
//        Метод toLowerCase() делает все буквы в строке строчными (например, строка "Vertex" станет строкой "vertex").

        String str2 = "I love JAVA";
        String result = str2.toLowerCase();
        System.out.println();
        System.out.println("Result: " + result);
/////
        str2 = "TEXT 1 2 3";
        result = str2.toLowerCase();
        System.out.println("Result: " + result);
/////
        str2 = "vertex";
        result = str2.toLowerCase();
        System.out.println("Result: " + result);



//        Урок 34: equals() в Java - проверить равны ли две строки
//        Метод equals() проверяет, равны ли два объекта (например, две строки). Метод прописан для основных классов Java.

        String str5 = "Good morning";
        String str6 = "Good morning";
        String str7 = "Good evening";

        System.out.println();
        System.out.println("String '" + str5 + "' equals '" + str6 + "':  " + str5.equals(str5));
        System.out.println("String '" + str5 + "' equals '" + str7 + "':  " + str5.equals(str7));


















    }
}
