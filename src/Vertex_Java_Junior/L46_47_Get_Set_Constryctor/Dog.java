package Vertex_Java_Junior.L46_47_Get_Set_Constryctor;


/////  Класс Dog пример Явного конструктора !!


public class Dog {

    private String name;
    private String color;


/////    Явный конструктор

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

/////

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}