package package1;

public class Super {
    int a = 100;
    Super(){

    }
    Super(int c){
        System.out.println(c);
    }
    public static void main(String[] args) {
        Super s = new Super();
        Duper d = new Duper();
        d.display();
        s.display();

    }
    void display() {

        System.out.println("super class");
    }
}
class Duper extends Super{

    void display() {

        System.out.println(super.a);
    }
}
