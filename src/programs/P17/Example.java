package programs.P17;

//(a)USE OF try/catch BLOCK: Program
class Example {
    public static void main(String args[]){
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be displayed");
        } catch (ArithmeticException e) {
            System.out.println("This is a divide-by-zero exception");
        }
        System.out.println("Out of try and catch");
    }
}
