package Vertex_Java_Junior;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class L57_WorkWithFile_FileWriter_FileReader {


    public static void main(String[] args) throws Exception {


/////                       Lessons FileWriter

        FileWriter writer = new FileWriter("Lesson57_FileWriter.txt");

        writer.write("Я впервые изучаю FileWriter");

        writer.close();


////


        FileWriter writer1 = new FileWriter("L57_FileWriter_Int.txt");

         for (int x = 1; x <= 5; x++){

             writer1.write(x + " ");
         }

         writer1.close();



/////   С помощью \n выводим с новой строки !!!

        FileWriter writer2 = new FileWriter("L57_FileWriter_String.txt");

        writer2.write("Anisimiv\nSergey\nVasilevich");

        writer2.close();


////////////////////         Lessons  FileReader

//.nextLine()   - это метод, который считывает строку (до ENTER), и возвращает это значение

        FileReader reader = new FileReader("L57_FileWriter_String.txt");   //
        Scanner scan = new Scanner(reader);
        System.out.println(scan.nextLine());

        reader.close();

/////

//.hasNextLine() - метод, который возвращает boolean - true или false, показывая, есть ли следующая строка.

        FileReader reader1 = new FileReader("L57_FileWriter_String.txt");
        Scanner scan2 = new Scanner(reader1);

        int x = 1;
        while (scan2.hasNextLine()) {
            System.out.println(x + " : " + scan2.nextLine()); // тут прописываем nextLine() так как нужно получить конкретную строку
            x++;
        }

        reader1.close();












        





    }

}
