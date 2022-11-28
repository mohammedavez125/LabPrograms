package programs.P19;

//MONSTRATION OF THREAD SYNCHRONIZATION
//(a)Using Synchronization With Methods Program
class CallMe {
    synchronized void callmeth(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    CallMe2 target;
    Thread t;

    public Caller(CallMe2 targ, String s){
        this.target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run(){
        target.callmeth(msg);
    }
}

class SynchMeth {
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
