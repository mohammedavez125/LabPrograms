package Lab__Internals.P4;

abstract class Demo {
    abstract void show();
}

interface Printable {
    void print();
}

class AbstractClassDemo extends Demo implements Printable {
    void show(){
        System.out.println("This is Abstract class method");
    }

    public void print(){
        System.out.println("This is interface method");
    }

    public static void main(String[] args){
        AbstractClassDemo a = new AbstractClassDemo();
        a.show();
        a.print();
    }
}
