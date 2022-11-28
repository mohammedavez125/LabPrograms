package programs.P4;

// (a) Demonstrate usage of Method with return value
class Box {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }
}

class RetMeth {
    public static void main(String args[]){
        Box1 obj1 = new Box1();
        Box1 obj2 = new Box1();
        double vol;

        obj1.width = 10;
        obj1.height = 20;
        obj1.depth = 30;

        obj2.width = 3;
        obj2.height = 4;
        obj2.depth = 6;

        vol = obj1.volume();
        System.out.println("Volume of 1st box is:" + vol);

        vol = obj2.volume();
        System.out.println("Volume of 2nd box is:" + vol);
    }
}
