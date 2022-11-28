package programs.P17;

//(f)USING finally BLOCK: Program:
class FinallyDemo {
    static void procA(){
        try {
            System.out.println("Inside procA()");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA’s finally");
        }
    }

    static void procB(){
        try {
            System.out.println("Inside procB()");
            return;
        } finally {
            System.out.println("procB’s finally");
        }
    }

    static void procC(){
        try {
            System.out.println("Inside procC()");
        } finally {
            System.out.println("procC’s finally");
        }
    }

    public static void main(String args[]){
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception Caught");
        }
        procB();
        procC();
    }
}
