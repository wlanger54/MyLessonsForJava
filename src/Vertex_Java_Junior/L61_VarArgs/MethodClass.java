package Vertex_Java_Junior.L61_VarArgs;

public class MethodClass {

    public int addall(int ... numbers){

        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
            System.out.println("Adding " + numbers[i] + ": get " + sum);
        }
        return sum;
    }
}
