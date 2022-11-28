package programs.P5;

//Demonstration of Parameterized Constructors:
class Box1 {
    double width, height, depth;

    Box1(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return width * height * depth;
    }
}

class ParamConst {
    public static void main(String args[]){
        Box1 obj1 = new Box1(10, 20, 15);
        Box1 obj2 = new Box1(3, 6, 9);
        double vol;
        vol = obj1.volume();
        System.out.println("Volume of 1st box is :" + vol);
        vol = obj2.volume();
        System.out.println("Volume of 2nd box is: " + vol);
    }
}

