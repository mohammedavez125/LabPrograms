package programs.P11;

//DEMONSTRATION OF MULTILEVEL INHERITANCE Program:
class A {
    A(){
        System.out.println(" This is A’s constructor ");
    }
}

class B extends A {
    B(){
        System.out.println("This is B’s constructor");
    }
}

class C extends B {
    C(){
        System.out.println("This is C’s constructor ");
    }
}

class MultiInherit {
    public static void main(String args[]){
        C obj = new C();
    }
}
