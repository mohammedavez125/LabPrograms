package programs.P3;
//a)Demonstrating classes with one object.
class Box {
    double width;
    double height;
    double depth;
}

public class MainBox {
    public static void main(String args[]){
        Box1 obj1 = new Box1();
        double vol;

        obj1.width = 10;
        obj1.height = 20;
        obj1.depth = 30;

        vol = obj1.width * obj1.height * obj1.depth;
        System.out.println("volume is: " + vol);
    }

}


