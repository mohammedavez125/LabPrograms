package programs.P19;

//(b)Using Synchronization with Block of code or statements
class CallMe2 {
    void callmeth(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("]");
    }
}

class Caller2 implements Runnable {
    String msg;
    CallMe2 target;
    Thread t;

    public Caller2(CallMe2 targ, String s){
        this.target = targ;
        msg = s;
        t = new Thread(this);
        t.start();


    }

    public void run(){
        synchronized (target) {
            target.callmeth(msg);
        }
    }
}

class SynchBlock {
    public static void main(String args[]){
        CallMe2 target = new CallMe2();
        Caller2 obj1 = new Caller2(target, "Hello");
        Caller2 obj2 = new Caller2(target, "Synchronized");
        Caller2 obj3 = new Caller2(target, "World");
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}

