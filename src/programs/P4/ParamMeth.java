package programs.P4;

//(b) Demonstrate usage of Method with parameters
class Box1 {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

    void SetDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

class ParamMeth {
    public static void main(String args[]){
        Box1 obj1 = new Box1();
        Box1 obj2 = new Box1();
        double vol;
        obj1.SetDim(10, 20, 15);
        obj2.SetDim(3, 6, 9);
        vol = obj1.volume();
        System.out.println("Volume of box 1 is:" + vol);
        vol = obj2.volume();
        System.out.println("Volume of box 2 is:" + vol);
    }
}

