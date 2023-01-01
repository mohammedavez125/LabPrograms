package Lab__Internals.P5;

// A) Write a Java program to implement the concept of exception handling

class ExceptionHandling {
    public static void main(String[] args){
        int d,a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be displayed");
        } catch (ArithmeticException e) {
            System.out.println("This is a divide-by-zero exception");
        } finally {
            System.out.println("Out of try and catch");
        }
    }
}