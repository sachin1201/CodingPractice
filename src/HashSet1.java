import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

    public static void main(String[] args) {

        HashSet<String> h = new HashSet<String>();
        h.add("audi");
        h.add("bmw");
        h.add("ferrari");
        h.add("audi");

        Iterator<String> it = h.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
