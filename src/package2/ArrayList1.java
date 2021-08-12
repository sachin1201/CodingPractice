package package2;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList1 obj = new ArrayList1();
        obj.printPascalTriangle(4);

    }

    /**
     * 1
     * 11
     * 121
     * 1331
     * 14641
     * 15101051
     */
    private void printPascalTriangle(int Rows) {
        ArrayList Pascal = new ArrayList();
        for (int j = 1; j < Rows + 1; j++) {
            ArrayList LastPascal = (ArrayList)Pascal.clone();
            Pascal.clear();
//            int length = j;
            for (int i = 0; i < j; i++) {
                if (i == 0 || i == j - 1) {
                    Pascal.add(1);
                }else{
                    Pascal.add((int) LastPascal.get(i) + (int) LastPascal.get(i-1));
                }
            }
            System.out.println(Pascal);
            LastPascal.clear();
        }
    }
}
