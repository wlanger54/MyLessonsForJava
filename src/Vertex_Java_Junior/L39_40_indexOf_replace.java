package Vertex_Java_Junior;


//        Урок 39: indexOf() в Java - найти в строке символ и его индекс
//        Урок 40: replace() - заменить символ в строке в Java





public class L39_40_indexOf_replace {

    public static void main(String[] args) {


// Урок 39: indexOf() в Java - найти в строке символ и его индекс

// Пример-1

              System.out.println();

        String st = "Hello";

        int index1 = st.indexOf('H');
        int index2 = st.indexOf('o');
        int index3 = st.indexOf('k');
        System.out.println("Мы ищем букву 'Н' в строке " + st + ". Индекс данной буквы " + index1);
        System.out.println("Мы ищем букву 'о'в строке " + st + ". Индекс данной буквы " +index2);
        System.out.println("Мы ищем букву 'k'в строке " + st + ". Индекс данной буквы " +index3);


// Пример-2

             System.out.println();

        String hello = "Hello";

        int index5 = hello.indexOf('H', 2);
        int index6 = hello.indexOf('o', 2);
        int index7 = hello.indexOf('W', 2);
        System.out.println("Мы ищем букву 'H' в строке "+hello+" начиная с индекса номер 2. Индекс "+index5 );
        System.out.println("Мы ищем букву 'o' в строке "+hello+" начиная с индекса 2. Индекс "+index6 );
        System.out.println("Мы ищем букву 'W' в строке "+hello+" начиная с индекса 2. Индекс "+index7 );


// Пример-3

             System.out.println();


        String gm = "Good morning";

        int index10 = gm.indexOf("morni");
        int index11 = gm.indexOf("Vertex");
        int index12 = gm.indexOf("Good morning", -2);
        int index13 = gm.indexOf("Good morning", 2);
        int index14 = gm.indexOf("Good morning", 999);
        System.out.println("Мы ищем 'morni' в строке "+gm+". Индекс "+index10 );
        System.out.println("Мы ищем 'Vertex' в строке "+gm+". Индекс "+index11 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса -2. Результат: "+index12 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса 2. Результат: "+index13 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса 888. Результат: "+index14 );



// Урок 40: replace() - заменить символ в строке в Java


// Пример-1

        System.out.println();

        String oldString = "ABC";
        String newString = oldString.replace('A', 'B');

        System.out.println("OldString: " + oldString);
        System.out.println("NewString: " + newString);


// Пример-2

              System.out.println();

        String oldstring = "JAVA";
        String newstring = oldstring.replace('A', 'I');

        System.out.println("OldString: " + oldstring);
        System.out.println("NewString: " + newstring);


// Пример-3

              System.out.println();

        String old1 = "Java";
        String new1 = old1.replace("av", "oshu");

        System.out.println("Old String: " + old1);
        System.out.println("New String: " + new1);











    }
}
