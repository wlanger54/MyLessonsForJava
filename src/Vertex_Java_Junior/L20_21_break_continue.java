package Vertex_Java_Junior;

// Урок 20 - 21 : Оператор break и continue




public class L20_21_break_continue {


    public static void main(String[] args) {




// Задача-1   break

     int a = 1;
     int b = 3;

     while (a <= 5) {
         System.out.println(a + ": цикл выплняется! ");
         if (a == b)
             break;
         a++;
     }


// Задача-2   break


        System.out.println();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Это первый цикл! Я выполняюсь " + i + " раз");
            for (int y = 1; y <= 10; y++) {
                System.out.println("    Это второй цикл! Я выполняюсь " + y + " раз");
                if (y == 2)
                    break;
            }
        }


//    Оператор continue

        System.out.println();

        for(int con = 1; con < 7; con++ ) {
            System.out.println(con + " я выполняюсь перед continue!");
            if (con > 2)
                continue;
            System.out.println("   " + con + ": я выплняюсь всего два раза !");
        }







    }
}
