package Vertex_Java_Junior;


import java.io.FileWriter;
import java.io.IOException;

public class L60_Exception_Isklucheniya {

    public static void main(String[] args)throws Exception  {

try {
    FileWriter writer5 = new FileWriter("Lesson60_FileWriter_Exception.txt");
    writer5.close();
    writer5.write("Я впервые изучаю Exception : try - catch");
} catch (IOException e) {
    System.out.println(" Нельзя записывать в закрытый файл !");
}



    }





}
