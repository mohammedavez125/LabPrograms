package programs.P17;

//(b)USING MULTIPLE CATCH CLAUSES:-
class MulCatch {
    public static void main(String args[]){
        try {
            int a = args.length;
            System.out.println("a=" + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception due to c" + e);
        }
        System.out.println("After try/catch block");
    }
}
