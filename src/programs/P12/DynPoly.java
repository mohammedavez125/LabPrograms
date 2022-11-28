package programs.P12;

//DEMONSTRATION OF DYNAMIC POLYMORPHISM Program
class Figure {
    double dim1, dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("area for figure is not defined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a, b);
    }


    double area(){
        System.out.println("this is rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("this is for triangle");
        return dim1 * dim2 / 2;
    }
}

class DynPoly {
    public static void main(String args[]){
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        figref = r;
        System.out.println("area is : " + figref.area());
        figref = t;
        System.out.println("area is : " + figref.area());
        figref = f;
        System.out.println("area is : " + figref.area());
    }
}

