package programs.P18;

//DEMONSTRATION OF CREATING A THREAD
// (a) CREATING THREAD BY IMPLEMENTING Runnable INTERFACE

class ChildThread implements Runnable {
    Thread t;

    ChildThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread:" + t);
        t.start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread:" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exit from Child Thread");
    }
}

class ThreadDemoRunnable {
    public static void main(String args[]){
        new ChildThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Exit from Main Thread");
    }
}