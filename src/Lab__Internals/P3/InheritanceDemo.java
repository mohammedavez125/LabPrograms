package Lab__Internals.P3;

class One {
    String one_str = "class One";

    void displayOne(){
        System.out.println("parent " + one_str);
    }
}

class Two extends One {
//    String two_str = "class Two";

    void displayTwo(){
        super.displayOne();
        System.out.println("child class Two inherited from class One displaying single level inheritance");
    }
}

class Three extends Two {
//    String three_str = "class Three";

    void displayThree(){
        super.displayTwo();
        System.out.println("child class Three inherited from class Two and class One displaying multilevel inheritance");
    }
}

class InheritanceDemo {

    public static void main(String[] args){
        Three obj = new Three();
        obj.displayThree();
    }
}

