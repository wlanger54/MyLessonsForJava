package Lessons_Java_Selenium_Junior.Lessons;



//String

public class L15_String {

    public static void main(String[] args) {

        // конкотенация строк (Обьединение)

        java.lang.String k1 = "Sergey ";    // конкотенация строк (Обьединение)
        java.lang.String k2 = "Anisimov";
        java.lang.String k3 = "!";
        java.lang.String res;
        res = k1 + k2 + k3;
        System.out.println(res);

        res = k1.concat(k2).concat(k3);  // это более правильный вариант для производительности
        System.out.println(res);


/////


        String s = "Hello World";

        System.out.println(s.equals("Hi i am Sergey"));   // Сравнение строк
        System.out.println(s.equals("Hello World"));

        String s2 = "Hello";                             // Сравниваем строку S  с S2
        System.out.println(s.equals(s2));

/////

        s = "text";
        s2 = "TEXT";
        System.out.println();
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));  // игнорирует регистр : text или TEXT

/////

        s = "TeXt";
        System.out.println();
        System.out.println(s);
        System.out.println(s.toLowerCase());  // все с маленьких букв
        System.out.println(s.toUpperCase());  // все с большых букв


        System.out.println();
        System.out.println(s.charAt(2)); // выдает место буквы в нашем слове


/////

        s = "Hello World !";
        System.out.println();
        System.out.println(s.contains("Hello"));    //  Проверяет содержит ли в наша строка данное слово
        System.out.println(s.contains("Text"));
        System.out.println(s.length()); // проверяет длину строки

/////

        System.out.println();
        System.out.println(s.startsWith("He"));  // Проверяем правильно ли начинаеться или заканчивается строка
        System.out.println(s.startsWith("Wo"));
        System.out.println(s.endsWith("ld"));
        System.out.println(s.endsWith("!"));

/////

        String str = "My name is %s! I am %d years old!";
        String name = "Sergey";
        int age = 33;
        System.out.println();
        System.out.println(String.format(str, name,  age));  // метод который позволяет фармотировать строчку
        System.out.println(String.format(str, "Alex", 30));

/////

        s = "Hello World";
        System.out.println();
        System.out.println(s.substring(1, 5));  // Обрезает строки по индексу
        System.out.println(s.substring(6));
























    }





}
