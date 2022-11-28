package programs.P9;

//DEMONSTRATION OF SINGLE INHERITANCE
class A    // superclass or parentclass
{
    int i, j;

    void showij(){
        System.out.println("i & j are : "+i + " & "+j);
    }
}

class B extends A    // childclass
{
    int k;    // variable in B only void showk()

    void showk(){
        System.out.println("k is : "+k);
    }

    void sum(){
        System.out.println("i + j + k is : "+(i + j + k));
    }
}

class SingleInherit {
    public static void main(String args[]){
        A superobj = new A(); // A’s object
        B subobj = new B(); // B’s object
        superobj.i = 10;
        superobj.j = 20;
        System.out.println("Contents of superclass : ");
        superobj.showij();
        System.out.println();
        subobj.i = 7; //subclass have access to all public subobj.j = 8; //superclass
        subobj.k = 9;

        System.out.println("Contents of subclass : ");
        subobj.showij();
        subobj.showk();
        System.out.println("Addtion is : ");
        subobj.sum();
    }
}
