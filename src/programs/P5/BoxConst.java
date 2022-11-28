package programs.P5;
//DEMONSTRATION OF CONSTRUCTORS
//(a)Demonstration of Normal

class Box {
    double width, height, depth;

    Box(){
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume(){
        return width * height * depth;
    }
}

class BoxConst {
    public static void main(String args[]){
        Box obj1 = new Box();
        Box obj2 = new Box();
        double vol;

        vol = obj1.volume();
        System.out.println("Volume of 1st box is :" + vol);

        vol = obj2.volume();
        System.out.println("Volume of 2nd box is:" + vol);
    }
}

