package programs.P13;
//A) DEMONSTRATION OF METHOD OVERRIDING Program


class A {
    int i, j;
    A(int a, int b){

        i = a;
        j = b;
    }
    void show(){
        System.out.println("i and j are : " + i + " and " + j);

    }
}

class B extends A {
    int k;
    B(int a, int b, int c){
        super(a, b);
        k = c;
    }
    void show(){
//         super.show();
//         Note: If you remove the leading comment symbol in show() method then the output is
//         i and j are :1 and 2
//         k is : 3
        System.out.println("k is : " + k);
    }
}

class MethOverride {
    public static void main(String args[]){
        B subobj = new B(1, 2, 3);
        subobj.show();
    }
}

