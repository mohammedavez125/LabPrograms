package programs.P3;

//(b)Demonstrate classes with two objects
class Box1 {
    double width;
    double height;
    double depth;
}

class MainBox1 {
    public static void main(String args[]){
        double vol1, vol2;
        Box1 obj1 = new Box1();
        Box1 obj2 = new Box1();

        obj1.width = 10;
        obj1.height = 20;
        obj1.depth = 30;

        obj2.width = 3;
        obj2.height = 6;
        obj2.depth = 9;

        vol1 = obj1.width * obj1.height * obj1.depth;
        vol2 = obj2.width * obj2.height * obj2.depth;


        System.out.println("volume of box1 is:" + vol1);
        System.out.println("volume of box2 is:" + vol2);
    }
}




