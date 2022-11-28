package programs.P2;
//DEMONSTRATION OF TYPE CONVERSION & TYPE CASTING
public class Promote {
    public static void main(String args[]){
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 500000;
        float F = 5.67F;
        double d = 0.1234, result;
        result = (F * b) + (i / c) - (d * s);
        System.out.println("result is :" + result);
    }
}
