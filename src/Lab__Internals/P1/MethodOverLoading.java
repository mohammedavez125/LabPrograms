package Lab__Internals.P1;

//A) Write Java program to illustrate the concept of class with method overloading.
class Sum{
    public int sum(int a,int b){
        return(a+b);
    }
    public int sum(int a,int b,int c){
        return(a+b+c);
    }
}
public class MethodOverLoading {
    public static void main(String[] args){
        Sum s1=new Sum();
        System.out.println(s1.sum(1,2));
        System.out.println(s1.sum(1,2,3));
    }
}
