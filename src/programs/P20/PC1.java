package programs.P20;
//Write a Java program that correctly implements producer consumer problem using the concept of inter thread communication.
// An incorrect implementation of a producer and consumer.
class Q {
    int n;

    synchronized int get(){
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("Put: " + n);
    }
}

class Producer implements Runnable {
    Q2 q2;

    Producer(Q2 q2){
        this.q2 = q2;
        new Thread(this, "Producer").start();
    }

    public void run(){
        int i = 0;
        while (true) {
            q2.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q2 q2;

    Consumer(Q2 q2){
        this.q2 = q2;
        new Thread(this, "Consumer").start();
    }

    public void run(){
        while (true) {
            q2.get();
        }
    }
}

class PC1 {
    public static void main(String args[]){
        Q2 q2 = new Q2();
        new Producer2(q2);
        new Consumer2(q2);

        System.out.println("Press Control-C to stop.");
    }
}
