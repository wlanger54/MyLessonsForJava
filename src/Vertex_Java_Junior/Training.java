package Vertex_Java_Junior;

import java.util.ArrayList;

public class Training {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Hey!");
        myArrayList.add("This");
        myArrayList.add("is");
        myArrayList.add("my");
        myArrayList.add("first");
        myArrayList.add("list!");



        for (int i = 0; i < myArrayList.size(); i++) 
            System.out.println(myArrayList.get(i));

    }


}