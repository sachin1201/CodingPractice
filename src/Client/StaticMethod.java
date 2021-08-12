package Client;

public class StaticMethod {
    public static void main(String[] args) {
        Child2 c1 = new Child2();
//        Child2 c2 = new Child2();
        c1.call();
//        c2.call();
    }
}

class Child {
    public void call() {
        System.out.println("Call 1 running");
    }
}

class Child2 extends Child {
    public void call() {
        System.out.println("Call 2 running");
    }
}
