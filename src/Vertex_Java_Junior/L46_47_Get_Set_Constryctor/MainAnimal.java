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




///// Это метод для "примера с методом" (который ниже).  Это очень удобно !  тут явный конструктор !

        Dog dog1 = new Dog("Graf", "black");
        pereklichka(dog1);
        Dog dog2 = new Dog("Chapi", "grey");
        pereklichka(dog2);

    }


    ///// Пример с методом если будет много собак


        public static void pereklichka(Dog dogs) {
            System.out.println( dogs.getName());
            System.out.println( dogs.getColor());

        }

}
