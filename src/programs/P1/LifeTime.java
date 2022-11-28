package programs.P1;

public class LifeTime {
    public static void main(String args[]){
        int x;
        for (x = 0; x < 3; x++) {
            int y;
            y = -1;
            System.out.println("y is now:" + y);
            y = 100;
            System.out.println("y is now:" + y);
        }

    }

}
