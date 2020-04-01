package Vertex_Java_Junior;

public class L59_MassiveObject {



    static Cat[] abc = new Cat [3];


    public static void main(String[] args) {

            abc[0] = new Cat("Kitty");
            abc[1] = new Cat("Molly");
            abc[2] = new Cat("Lily");

            for (int i = 0; i<3; i++){
                System.out.println(abc[i].name);
            }

    }
}


class Cat{
        String name;

        public Cat (String name){
            this.name = name;

    }
}
