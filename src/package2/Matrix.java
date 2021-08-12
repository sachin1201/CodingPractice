package package2;

import java.util.Scanner;

public class Matrix {

    public static void main(String args[]) {
        Matrix obj = new Matrix();
//        obj.printMatrixUpperTraingular(3, 3);
        int[] arr = new int[]{5, 1, 4, 8, 7, 6, 3, 2, 0};
        int n = 9;
        int item = obj.findMissingPositiveIntegerInPlace(arr,n);
        if(item == -1){
            System.out.println("missing number is "+ n);
        }else{
            System.out.println("missing number in array is " + item);
        }

    }

    /**
     * input array of 0 to n : -{0,1,4,2,6,5,7}  => 3
     * Dont use any extra data structure arrFinal
     *
     * @param arrInput
     */
    private int findMissingPositiveIntegerInPlace(int[] arrInput, int n) {
        for (int i = 0; i < arrInput.length; i++) {
            int crrNum = arrInput[i];
            if(crrNum < arrInput.length) {
                int d = arrInput[crrNum];
                arrInput[i] = d;
                arrInput[crrNum] = crrNum;
            }
        }
        for (int i = 0; i < arrInput.length; i++) {

            if (arrInput[i] != i) {
                return i;
            }
        }
        return -1;
    }

    /**
     * input array of 0 to n : -{0,1,4,2,6,5,7}  => 3
     *
     * @param arrInput
     */
    private int findMissingPositiveInteger(int[] arrInput, int n) {
        int item = 0;
        for (int i = 0; i < arrInput.length; i++) {
            for (int j = 0; j < arrInput.length - i - 1; j++) {
                if (arrInput[j] > arrInput[j + 1]) {
                    int c = arrInput[j];
                    arrInput[j] = arrInput[j + 1];
                    arrInput[j + 1] = c;
                }
            }
        }
        if (arrInput[arrInput.length - 1] == n - 1) {
            return n;
        } else {
            for (int i = 0; i < n; i++) {
                if (arrInput[i] != i) {
                    item = i;
                    break;
                }
            }
        }
        if (arrInput.length > n) {
            item = -10;
            return item;
        }
        return item;
    }

    /**
     * 3 5 7 9
     * 4 6 9 2
     * 4 2 6 5
     * 1 7 3 8
     * <p>
     * Output :
     *
     * @param m = number of rows
     * @param n = number of columns
     */
    private void printMatrixUpperTraingular(int m, int n) {
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Scanner in = new Scanner(System.in);
                System.out.println("enter a number");
                int a = in.nextInt();
                arr[i][j] = a;
            }
        }
        System.out.println("Input Matrix is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Upper Triangular Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("   ");
                } else {
                    System.out.print(arr[i][j] + "  ");
                }
            }
            System.out.println();
        }

    }
}
