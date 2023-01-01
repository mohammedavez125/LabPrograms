package Lab__Internals.P6;

/*
A) Write a Java program to illustrate the concept of threading using Thread
Class and runnable Interface.
*/

class AddOne extends Thread {
    public void run(){
        System.out.println("Process executing on thread " + Thread.currentThread().getId());
        int sum = 0;
        for (int i = 10; i <= 20; i++)
            sum = sum + i;
        System.out.println("sum is : " + sum);
    }
}

class AddTwo implements Runnable {
    public void run(){
        System.out.println("Process executing on thread " + Thread.currentThread().getId());
        int sum = 0;
        for (int i = 20; i <= 30; i++)
            sum = sum + i;
        System.out.println("sum is : " + sum);
    }
}

class ThreadDemo {
    public static void main(String[] args){
        AddOne obj1 = new AddOne();
        Thread obj2 = new Thread(new AddTwo());
        obj1.start();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        obj2.start();
    }
}