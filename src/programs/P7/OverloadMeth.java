package programs.P7;

//DEMONSTRATION OF OVERLOADING CONCEPT IN JAVA:
//(a)Demonstrating method overloading
class Overload {
    void test(){
        System.out.println("no parameters");
    }

    void test(int a){
        System.out.println("Value of a is: " + a);
    }

    void test(int a, int b){
        System.out.println("a & b are: " + a + " & " + b);
    }

    double test(double a){
        System.out.println("value of a for double is: " + a);
        return a * a;
    }
}

class OverloadMeth {
    public static void main(String args[]){
        Overload obj = new Overload();
        double result;
        obj.test();
        obj.test(20);
        obj.test(10, 20);
        result = obj.test(123.25);
        System.out.println("result is: " + result);
    }
}
