package Vertex_Java_Junior;

// Практика по Урокам


import java.io.*;



public class L0_TasksForPractice {

    public static void main(String[] args) throws Exception {
        int k1 = 2;
        int k2 = 9;
        newFile( k1, k2);
    }


    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("C:\\Users\\User\\Desktop\\file1.txt");

        for(int i = k1; i <= k2; i++) {

            nFile.write("\ni");

        }

        nFile.close();
    }
}