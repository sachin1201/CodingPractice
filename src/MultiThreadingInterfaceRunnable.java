class Hi1 implements Runnable {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try{ Thread.sleep(500);} catch(Exception e) {}
        }
    }
}
class Hello1 implements Runnable{
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try{ Thread.sleep(500);} catch(Exception e) {}
        }
    }
}
public class MultiThreadingInterfaceRunnable {
    public static void main(String[] args) {
        Runnable o1 = new Hi1();
        Runnable o2 = new Hello1();

        Thread obj1 = new Thread(o1);
        Thread obj2 = new Thread(o2);

        obj1.start();
        try{ Thread.sleep(20);} catch(Exception e) {}
        obj2.start();
    }
}

