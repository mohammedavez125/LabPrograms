package programs.P17;

//(e)USING throws KEYWORD:Program:
class ThrowsDemo {
    static void throwone() throws IllegalAccessException{
        System.out.println("inside throwone()");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]){
        try {
            throwone();
        } catch (IllegalAccessException e) {
            System.out.println("caught" + e);
        }
    }
}
