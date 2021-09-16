import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a",5);
        happy.put("b",56);
        happy.put("c",454);


        System.out.println(happy.replace("a",9));
        System.out.println(happy);

    }

}
