package programs.P16.ArithmeticProblem.InnerPackage;

import programs.P16.ArithmeticProblem.MyMath;

class ArithmeticTest {
    public static void main(String as[]){
        MyMath m = new MyMath();
        System.out.println(m.add(8, 5));
        System.out.println(m.sub(8, 5));
        System.out.println(m.mul(8, 5));
        System.out.println(m.div(8, 5));
        System.out.println(m.mod(8, 5));
    }
}
