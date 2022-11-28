package programs.P15;

//DEMONSTRATION OF MULTIPLE INHERITANCE VIA INTERFACE
interface i1 {
    public void i();
}

class A {
    public void a(){
        System.out.println("I m in a");
    }
}

class B extends A implements i1 {
    public void i(){
        System.out.println("I m in b and came from interface i1");
    }
}

class MultipleInherit {
    public static void main(String args[]){
        A x = new A();
        B y = new B();
        y.a();
        y.i();
    }
}
