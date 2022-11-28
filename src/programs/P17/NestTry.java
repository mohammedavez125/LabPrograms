package programs.P17;

//(c)USING NESTED try STATEMENTS:- Program:-
class NestTry {
    public static void main(String args[]){
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a is:" + a);
            try {
                if (a == 1) a = a / (a - a);
                if (a == 2){
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception due to c" + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("divide by zero" + e);
        }
    }
}

