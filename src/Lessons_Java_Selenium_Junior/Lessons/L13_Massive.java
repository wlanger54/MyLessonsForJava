package Lessons_Java_Selenium_Junior.Lessons;



//  МАССИВЫ

public class L13_Massive {

    public static void main(String[] args) {

        String[] names;
        names = new String[3];


        String[] name = new String[3];   //Сокращенный вариант

        name[0] = "Vasya";
        name[1] = "Sasha";
        name[2] = "Sveta";
        System.out.println(name[0] + " and " + name[2] + " = Friends");
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);


        int[] array = {10, 20, 30};  // Сокращенный массив
        System.out.println();
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


// Пример с циклом For

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println();
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(array2[i]);
        }


        int[] arr2 = new int[15];
        System.out.println();
        for (int p = 0; p < 15; p++) {
            arr2[p] = p * 10;
            System.out.println(arr2[p]);
        }



// Узнать размер массива

        System.out.println();
        System.out.println(arr2.length);








    }


}
