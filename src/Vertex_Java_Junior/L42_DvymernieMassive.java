package Vertex_Java_Junior;

//Урок 42: Двумерные массивы в Java







public class L42_DvymernieMassive {

    public static void main(String[] args) {


        int [][] array = new int[2][2] ;

        array [0][0] = 1;
        array [0][1] = 2;
        array [1][0] = 3;
        array [1][1] = 4;
        for ( int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

///// Альтернатива


                   System.out.println();

        int [][] alt = { {5,10}, {15,20} };

        for (int a = 0; a < alt.length; a++) {
            for (int b = 0; b < alt[a].length; b++) {
                System.out.print(alt[a][b] + " ");
            }
            System.out.println();
        }





    }
}
