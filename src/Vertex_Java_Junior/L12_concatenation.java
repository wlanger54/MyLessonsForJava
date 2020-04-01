package Vertex_Java_Junior;


// Конкотенация

public class L12_concatenation {


    public static void main(String[] args) {



// Example-1

        String word = "Sergey ";
        String word2 = "Anisimov ";
        String word3 = "1986";
        String res = word.concat(word2).concat(word3);

        System.out.println(res);


// Example-2

        String morning = "доброе";
        String morning1 = "не доброе , потому что сегодня Понедельник";

        System.out.println();
        System.out.println("Сегодня утро " + morning);
        System.out.println("Сегодня утро " + morning1);

// Example-3

        String name = "Sergey";
        String car = "Porsche 918 Spyder";

        System.out.println();
        System.out.println(name + " купил " + car);




    }
}
