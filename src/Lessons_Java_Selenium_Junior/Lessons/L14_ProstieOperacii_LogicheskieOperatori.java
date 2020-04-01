package Lessons_Java_Selenium_Junior.Lessons;



// Простые операции и логические операторы . Урок 14

public class L14_ProstieOperacii_LogicheskieOperatori {

    public static void main(String[] args) {

        int a;
        a = 10;
        a = 20;
        System.out.println(a);

        int b = a;
        System.out.println(b);
        int c, d;

        c = d = b;

        System.out.println(c + " " + d);

        a = 13;
        b = 5;
        System.out.println();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        double d1 = 40;
        double d2 = 17;
        System.out.println();
        System.out.println(d1 / d2 );
        System.out.println(d1 % d2 ); // Деление по модулю

        a = b + c * d;    // a = (b + c) * d;  - ставим скобки что бы операция начиналась с сложения.
        System.out.println(a);


        int r = 15;
        int t = 22;
        System.out.println();
        System.out.println(r > t);
        System.out.println(r < t);
        System.out.println(r + 7 >= t);
        System.out.println(r + 8 <= t);
        System.out.println(r == t);
        System.out.println(r != t);
        System.out.println(r + 5 <= t - 2);
        System.out.println(!(r + 5 <= t - 2));  // Операция отрицания



// Инкремент и Декремент

        int y = 8;
        y++;
        System.out.println();
        System.out.println(y);
        y--;
        System.out.println(y);

        y = 8;
        System.out.println();
        System.out.println(y++);
        System.out.println(y);

        y = 10;
        a = ++y;   // Префиксная форма
        System.out.println(a);


// операции сравнения , boolean  типа

        a = 10;
        b = 20;
        System.out.println();
        System.out.println(a > b || a < b);
        System.out.println(a > b || b > 30);
        System.out.println(a > b && a < b);
        System.out.println(a > 9 && b == 20);

        System.out.println();
        System.out.println(a + 10 > 15 || b -5 > 10 && a > b );


        a = 9;
        System.out.println(Math.sqrt(a));  // выводим корень из 9
        System.out.println(Math.pow(a, 3));  // а в третей степени

// Комбинированные операции


        a = 10 ;
        a = a + 5;
        System.out.println();
        System.out.println(a);

        // сокращенно
        a = 10;
        a += 5;
        System.out.println();
        System.out.println(a);
        a -= 5 ;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);





    }



}
