package programs.P14;

//DEMONSTRATION OF ABSTRACT CLASSES Program
abstract class A {
    abstract void callme();
    void callmetoo(){
        System.out.println("This is a concrete method");
    }
}

class B extends A {
    void callme(){
        System.out.println("B’s implementation of callme");
    }
}

class AbstractDemo {
    public static void main(String args[]){
        B obj = new B();
        obj.callme();
        obj.callmetoo();
    }
}