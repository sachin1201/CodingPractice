package package1;

final public class FinalKeyword {
    public static void main(String[] args) {
        final int a;
        FinalKeyword obj = new FinalKeyword();
        obj.display();
    }
    final public void display() {
        System.out.println("Finale");
    }
}

//class SemiFinal extends FinalKeyword {
//    public void display() {
//        System.out.println("Semifinale");
//    }
//}


