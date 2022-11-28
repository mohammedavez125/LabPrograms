package programs.P10;

//DEMONSTRATION OF USE OF SUPER KEYWORD.
//(a)Use of ‘super’ keyword to call constructors of super
class Box {
    private double width, height, depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }


}

class DemoSuper {
    public static void main(String aggs[]){
        BoxWeight obj1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight obj2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = obj1.volume();
        System.out.println("volume of 1st box is :" + vol);
        System.out.println("weight of 1st box is : " + obj1.weight);
        System.out.println();
        vol = obj2.volume();
        System.out.println("volume of 2nd box is : " + vol);
        System.out.println("weight of 2nd box is : " + obj2.weight);
        System.out.println();
    }
}

