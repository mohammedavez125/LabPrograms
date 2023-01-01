package Lab__Internals.P5;

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