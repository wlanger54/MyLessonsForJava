package Vertex_Java_Junior;

//Урок 35: Массивы в Java





public class L35_Massive {

    public static void main(String[] args) {



// Получаем длину массива.  length - подсчитывает втоматически !

        int [] array = {10, 25, 75};
        int a = array.length;
        System.out.println(a);


/////

       String [] str = {"Sergey", "Anisimov", "1986"};
       int b = str.length;
        System.out.println();
        System.out.println(str[1]);    // Что бы обратиться к конкретному элементу


/////

       int[] in = new int[4];

       in[0] = 5;
       in[1] = 8;
       in[2] = 66;
       in[3] = 100;

        System.out.println();
        System.out.println(in[0]);
        System.out.println(in[1]);
        System.out.println(in[2]);
        System.out.println(in[3]);



//        Цикл - ваш лучший помощник при работе с массивами

        System.out.println();

        int[] cl = new int[4];

        cl[0] = 10;
        cl[1] = 25;
        cl[2] = 30;
        cl[3] = 50;

        for (int i = 0; i < cl.length; i++) {
            System.out.println(cl[i]);
        }



// Например, что делать, если нужно посчитать сумму элементов массива

        System.out.println();

        int[] array1 = new int[3];

        array1[0]=5;
        array1[1]=17;
        array1[2]=350;

        int sum = 0;

        for( int i = 0; i < array1.length; i++){
            sum += array1[i];
        }

        for( int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

        System.out.println("Сумма - "+ sum);















    }
}
