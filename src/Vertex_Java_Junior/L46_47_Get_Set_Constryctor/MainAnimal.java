package Vertex_Java_Junior.L46_47_Get_Set_Constryctor;

public class MainAnimal {

    public static void main(String[] args) {


/////         Неявный конструктор

        Cat cat = new Cat();
        Cat cat1 = new Cat();

        cat.setColor("Green");
        cat.setName("Barsik");

        cat1.setName("Vaska");
        cat1.setColor("Black");

        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat1.getName());
        System.out.println(cat1.getColor());
        System.out.println();


/////   Явный конструктор

        Dog dog = new Dog("Rex", "White");

        System.out.println(dog.getName());
        System.out.println(dog.getColor());










    }

}
