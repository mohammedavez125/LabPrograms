package programs.P8;

//constructor overloading Program:
class Box {
    double width, height, depth;

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box(){
        width = height = depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String args[]){
        Box obj1 = new Box();
        Box obj2 = new Box(10, 20, 15);
        Box obj3 = new Box(7);
        double vol;

        vol = obj1.volume();
        System.out.println("volume of box 1 is: " + vol);


        vol = obj2.volume();
        System.out.println("volume of box 2 is: " + vol);
        vol = obj3.volume();
        System.out.println("volume of box 3 is: " + vol);
    }

}
