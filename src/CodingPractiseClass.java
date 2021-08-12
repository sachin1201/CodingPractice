import java.util.ArrayList;
import java.util.Scanner;

public class CodingPractiseClass {
    int j;
    int l;
    int x; //variable Decelaration
    int y;
    long a = 123;

    //    int a = 1; //Variable declaration and intialisation
    float f = 0.75f; //0.25.0.15
    double z = 0.235;
    public char c = 'v';

    public void createForLoop() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public void createWhileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public void createIntArray() {
        int[] arr = new int[10];
        // inserting values in array
        for (int i = 0; i < 10; i++) {
            arr[i] = i * i;
        }
        System.out.println("Arr length:" + arr.length);

        //print all values of array
        for (int j = 0; j < arr.length; j++) {
            System.out.println("array value at " + j + "th index is:" + arr[j]);
        }

    }

    public void createCharArray() {
        char[] CharArray = new char[5];
        CharArray[0] = 'a';
        CharArray[1] = 'b';
        CharArray[2] = 'c';
        CharArray[3] = 'd';
        CharArray[4] = 'e';

        System.out.println("CharArray length is:" + CharArray.length);
        int i;
        for (i = 0; i < CharArray.length; i++) {
            System.out.println("array value at " + i + "th index is:" + CharArray[i]);
        }
    }

    public CodingPractiseClass(int p) {
        this.x = p;
    }

    public static void main(String[] args) {

        CodingPractiseClass obj = new CodingPractiseClass(3);
        // int factorial = obj.getFactorial(4);
        //System.out.println("Factorial is " + factorial);
//         int[] arr = new int[]{3,2,4,5,6};
//         obj.rotateArrayBy1PositionToLeft(arr);
//        String str1 = "sach";
//        String str2 = "in";
//        String strFinal = obj.concatenate2Strings(str1, str2);
//        System.out.println("strFinal :"+strFinal);

        // boolean isExists = obj.isNumberExistsInArray(array, 0);
        // System.out.println("array number exists is " + isExists);
        // int reverse = obj.reverseNumber(370);
        // System.out.println(" reverse number is: "+ reverse);
        // obj.printStringCharactersOneByONe("ANKUR");
        // boolean charExists = obj.isCharExistsInString("ANKUR", 'K');
        //   System.out.println("character existance is : " +charExists);
        // boolean strSame = obj.validateIfTwoStringsAreSame("achin", "sachin");
        // System.out.println("Strings are same: " + strSame);
        // boolean strReverse = obj.isStringReversible("abBabba");
        // System.out.println("String is Reversible: " + strReverse);
        // int count = obj.getMaxRepeatedCountofAnyCharacter("abbcccbaa");
        // int[] array = new int[]{1,3,5,91,1000,0,-1000};
        // int avg = obj.calculateAverageOfArray(array);
        // System.out.println("Avg of array: " + avg);
//         obj.createAndPrint2DArray();
//         int[][] arr1 = obj.createAndPrint2DArray();
//        int[][] arr1 = new int[][]{{1,2},{3,4},{5,6}};
//        //Taking input from user
//        int[][] arr2 = new int[3][2];
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                Scanner in = new Scanner(System.in);
//                System.out.println("Please enter a number:");
//                int a = in.nextInt();
//                arr2[i][j] = a;
//            }
//        }
//        int[][] arrfinal = obj.add2DArrays(arr1,arr2);
//        for(int i = 0; i < arrfinal.length; i++){
//            for(int j = 0; j < arrfinal[i].length; j++){
//                System.out.print(arrfinal[i][j]+" ");
//            }
//            System.out.println( );
//        }

//        float area = obj.calculateArea(2f);
//        System.out.println("Area is: "+area);
//        obj.printAllSubsetsOfString("anu");
//                  int[] FinalArr = obj.arrangeInDecreasingOrder(arr);
//        for (int i = 0; i < FinalArr.length; i++) {
//                System.out.print(FinalArr[i] + "  ");
//            }
//        int[][] arr = obj.takeUserInputForArrayData();
//        obj.printDiagonalElementsOf2DSquareMatrix(arr);
//        int[] arr = new int[]{3,4,5,7,8,9,10};
//        int x = obj.saerchNumberInSortedArray(arr,9);
//        System.out.println(x);
//        obj.removeItemFromArray(arr, 4);
//        String str = "aaabbbddddccfghhaaa";
//        System.out.println(obj.printCharsWithFrequency(str));
//        obj.createAndPrintAnArrayListOfAnimals();
//        CodingPractiseClass obj1 = new CodingPractiseClass(5);
//        System.out.println(obj);
//        System.out.println(obj1);



    }

    /**
     *
     * @param arrInput : {3,4,5,7,8,9,10}, saerchKey = 4 => true
     */
    private int saerchNumberInSortedArray(int[] arrInput, int saerchKey) {
        l = arrInput.length;
        j = arrInput.length/2;
        do {
            if (arrInput[j] == saerchKey) {
                System.out.println("a");
                return j;
            }
            if (arrInput[j] < saerchKey) {
                System.out.println("c");
                call1();
            } else {
                System.out.println("d");
                call2();
            }
        }while(true);
    }
    public void call1(){
        j = (j+l)/2;
        System.out.println("e");
    }
    public void call2(){
        l = j;
        j = j/2;
        System.out.println("f");
    }

    @Override
    public String toString() {
        return "CodingPractiseClass{" +"x=" + x + ", y=" + y + '}';
    }

    //{"lion","mouse","cat","cow"}
    //also use remove, clear and contains methods of arralist class and explore other methods as well
    private void createAndPrintAnArrayListOfAnimals() {
        ArrayList animalsList = new ArrayList();
        animalsList.add(10);
        animalsList.add(20);
        animalsList.add(30);
        System.out.println(animalsList);
//        animalsList.remove("mouse");
//        System.out.println(animalsList);
//        System.out.println(animalsList.contains("cat"));
//        animalsList.clear();
//        System.out.println(animalsList);
//        System.out.println(animalsList.contains("cat"));
        }

    //strInput : "aaabbbddddccfghhaaa" : 3a3b4d2c1f1g2h3a
    private String printCharsWithFrequency(String strInput) {
        int count = 1;
        String strFinal= "";
        for (int i = 0; i < strInput.length(); i++) {
            if (i == strInput.length() - 1) {
                strFinal = strFinal + String.valueOf(count) + strInput.charAt(i);
                break;
            }
            if (strInput.charAt(i) == strInput.charAt(i + 1)) {
                count++;
            } else {
                strFinal = strFinal + String.valueOf(count) + strInput.charAt(i);
                count = 1;
            }
        }
        return strFinal;
    }

    //{5,8,3,9,1},3 -> {5,8,3,1,1}
    //{4,6,8,2,3,6,9}, 4 -> {4,6,8,2,6,9,9}
    private void removeItemFromArray(int[] arrInput, int indexToRemove) {
        for (int i = indexToRemove; i < arrInput.length; i++) {
            if (i != arrInput.length - 1) {
                arrInput[i] = arrInput[i + 1];
            } else {
                arrInput[i] = 1;
            }
        }
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print(arrInput[i] + "  ");
        }
    }

    private void printDiagonalElementsOf2DSquareMatrix(int[][] arrInput) {
        System.out.print("Left Diagonal of array is: ");
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print(arrInput[i][i] + "  ");
        }
        System.out.println("");
        System.out.print("Right Diagonal of array is: ");
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print(arrInput[i][arrInput.length - 1 - i] + "  ");
        }
    }

    private int[][] takeUserInputForArrayData() {
        //Taking input from user
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner in = new Scanner(System.in);
                System.out.println("Please enter a number:");
                int a = in.nextInt();
                arr[i][j] = a;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    // arr:{3,2,7,5,4} -> {7,5,4,3,2}
    //This is called sorting of numbers or Array sorting
    private int[] arrangeInDecreasingOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int c = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = c;
                }
            }
        }
        return arr;
    }

    // a=3, b=5 => a=5, b=3
    private void swapTwoNumbers(int a, int b) {
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        //Swap values here
        int c = a;
        a = b;
        b = c;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    //Inheritance
    //Create classes for ElectronicDevices, TV, laoptop, mobile(smartphone, feathurePhone)

    public static class Electronics {
        void power() {
            System.out.println("It runs on power");
        }

        void screen() {
            System.out.println("It has Screen");
        }

    }

    public static class Tv extends Electronics {

    }

    public static class Laptop extends Electronics {

    }

    public static class Mobile extends Electronics {
        void calls() {
            System.out.println("It calls");
        }
    }
    public static class Smartphone extends Mobile {
        void calls() {
            System.out.println("It calls through touch");
        }
    }
    public static class Featurephone extends Mobile {
        void calls() {
            System.out.println("It calls through keys");
        }
    }

    //input arr[] = {3,5,1,2,7,8,9} and targetSum = 6 =>
    private void TwoSumProblem(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("index " + i + " and " + j + " are having sum equal to targetsum " + targetSum);
                    return;
                }
            }
        }
        System.out.println("No array values are having sum equal to targetsum " + targetSum);
    }


    //Str = "ank"
    //subsets : a,n,k,an,ak,nk,ank
    private void printAllSubsetsOfString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                System.out.print(str.charAt(i));
                System.out.println(str.charAt(j));
                for (int k = j + 1; k < str.length(); k++) {
                    System.out.print(str.charAt(i));
                    System.out.print(str.charAt(j));
                    System.out.println(str.charAt(k));
                    for (int l = k + 1; l < str.length(); l++) {
                        System.out.print(str.charAt(i));
                        System.out.print(str.charAt(j));
                        System.out.print(str.charAt(k));
                        System.out.println(str.charAt(l));
                    }
                }
            }
        }
    }

    //Create sequence of method to calculate area for different types of shapes
    //create method : int calculateArea()
    //square : calculateArea(int a)
    //rect : calculateArea(int w, int h)
    //circle : calculateArea(float r)
    //Trainagle :

    private int calculateArea(int a) {
        int area1 = a * a;
        return area1;
    }

    private int calculateArea(int w, int h) {
        int area1 = w * h;
        return area1;
    }

    private float calculateArea(float r) {
        float area1 = (float) (3.14 * r * r);
        return area1;
    }


    //input : str1 = "sach" & str2 = "in" -> output strFinal = "sachin"
    //U cant use String.concatenate().
    private String concatenate2Strings(String str1, String str2) {
        char[] charArrFinal = new char[str1.length() + str2.length()];
        for (int i = 0; i < charArrFinal.length; i++) {
            if (i < str1.length()) {
                charArrFinal[i] = str1.charAt(i);
            } else {
                charArrFinal[i] = str2.charAt(i - str1.length());
            }
        }
        String strFinal = new String(charArrFinal);
        return strFinal;
    }

    // input array: {1,2,3,4,5,6} --> {2,3,4,5,6,1}
    //Dont use any other array variable, use parameter array only
    private void rotateArrayBy1PositionToLeft(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int b = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = b;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Add 2 2d arrays and return final sum array
    private int[][] add2DArrays(int[][] arr1, int[][] arr2) {
        int[][] arrFinal = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arrFinal[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arrFinal;
    }

    //2 Dimensional array
    private void createAndPrint2DArray() {
        int[][] arr = new int[3][2];

        //  arr[0][0] = 2;
        //  arr[0][1] = 3;
        //  arr[1][0] = 4;
        //  arr[1][1] = 5;
        //  arr[2][0] = 51;
        //   arr[2][1] = 7;


        //Taking input from user
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner in = new Scanner(System.in);
                System.out.println("Please enter a number:");
                int a = in.nextInt();
                arr[i][j] = a;
            }
        }

        //Printing array contents
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private int calculateAverageOfArray(int[] arr) {
        int avgg = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avgg = sum / arr.length;
        return avgg;
    }

    private int getMaxRepeatedCountofAnyCharacter(String str) {
        int d = 1;
        for (int i = 0; i < str.length(); i++) {
            int c = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    c = c + 1;
                }
                if (c > d) {
                    d = c;
                }
            }
        }
        return d;
    }

    //str = sachin : return false
    //str = sachcas  ;return true
    //this is the program to validate if a string is palindrome string.
    private boolean isStringReversible(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    //s1 = Sachin s2 = sachin : return true
    //s1 = ankur s2 = saching : return false
    //s1 = sachin s2 = sachi : return false
    private boolean validateIfTwoStringsAreSame(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // ANKUR
    //Find if char ch exists in string str
    //isCharExistsInString("ankur", 'n')

    private boolean isCharExistsInString(String str, char ch) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return true;
            }
        }
        return false;
    }

    private void printStringCharactersOneByONe(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // number = 1237 0032
    // return value = 7321
    private int reverseNumber(int number) {
        int i = 1;
        int reverse = 0;
        while (true) {
            int rem = number % (10 * i);
            int n = rem / i;
            reverse = reverse + (n * 1000 / i);

            if (rem == number) {
                System.out.println("reverse is:" + reverse);
                return reverse;
            }
            i = i * 10;
        }
    }

    private boolean isNumberExistsInArray(int[] array, int number) {
        boolean isNumberExists = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isNumberExists = true;
                return isNumberExists;
            }
        }
        return isNumberExists;
    }


    //   *****
    //   ****
    //   ***
    //   **
    //   *
    private void printStarPattern2() {
        int i;
        int j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Find factorial of a given number and return it to mail method and print the value
    //Factorial of a number is multiplication of all numbers below it till 1 including number itself.
    //Example getFactorial(4) should return 24
    //Explaination: 4*3*2*1 = 24
    private int getFactorial(int number) {
        int i;
        int j = 1;
        for (i = 1; i < number + 1; i++) {
            j = j * i;
        }
        System.out.println(j);
        return j;
    }

    //   *
    //   **
    //   ***
    //   ****
    //   *****
    private void printStarPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }


    //Check if a number is a prime number
    private boolean validateIfPrimeNumber(int number) {
        boolean isPrimeLocal = true;

        for (int i = 2; i < number; i++) {
            int rem = number % i;
            if (rem == 0) {
                isPrimeLocal = false;
                System.out.println("number is completely divisible by:" + i);
                break;
            }
        }

        return isPrimeLocal;
    }

    //0 1 1 2 3
    private void printFibonnacciSeries(int number) {
        int j = 0;
        System.out.print(j + " ");
        int k = 1;
        System.out.print(k + " ");
        int sum = 0;
        for (int i = 3; i <= number; i++) {
            sum = j + k;
            System.out.print(sum + " ");

            j = k;
            k = sum;
        }
    }


    //Print "Its leap year" or "Its not a leap year" based on passed method parameter year
    private void isYearLeapYear(int year) {
        int rem4 = year % 4;
        int rem100 = year % 100;
        int rem400 = year % 400;
        if (rem4 == 0 && rem100 != 0) {
            System.out.println("" + year + " is a leap year");
        } else if (rem4 == 0 && rem100 == 0 && rem400 == 0) {
            System.out.println("" + year + " is a leap year");
        } else {
            System.out.println("" + year + " is not a leap year");
        }
    }

    //Print "Its a Vowel" or "Its a Consonant" : based on method parameter character c
    private void isCharacterAVowelOrConsonant(char c) {
        switch (c) {
            case 'a':
                System.out.println("" + c + " is vowel");
                break;
            case 'e':
                System.out.println("" + c + " is a vowel");
                break;
            case 'i':
                System.out.println("" + c + " is a vowel");
                break;
            case 'o':
                System.out.println("" + c + " is a vowel");
                break;
            case 'u':
                System.out.println("" + c + " is vowel");
                break;
            default:
                System.out.println("" + c + " is consonant");
        }
    }

    //1<=monthIndex <=12
    //Switch case will be used with primitive data types
    private void printMonthNames(int monthIndex) {

        switch (monthIndex) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("Fabruary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6: {
                System.out.println("June");
                break;
            }
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octuber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Not a valid month, Pass from 1-12");
        }
    }

    private void printIfNumberEvenOrOdd(int x) {
        int remainder = x % 2;
        System.out.println("remainder:" + remainder);
        if (remainder == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    // marks >=90 : A
    // marks >=70 : B
    // marks >=50 : C
    // marks >=35 : D
    // marks <35 : Fail
    private void printStudentGradesFromMarks(int marks) {

        if (marks >= 90) {
            System.out.println("Student belongs to Grade A");
        } else if (marks >= 70) {
            System.out.println("Student belongs to Grade B");
        } else if (marks >= 50) {
            System.out.println("Student belongs to Grade C");
        } else if (marks >= 35) {
            System.out.println("Student belongs to Grade D");
        } else {
            System.out.println("Student is Failed");
        }
    }


    private void printHello() {
        System.out.println("Hello c:" + c + " and z:" + z);
    }

    private int addTwoNumbers(int a, int b) {
        int sumLocal = a + b;
        return sumLocal;
    }

    private int substractTwoNumbers(int a, int b) {
        int subtractLocal = a - b;
        return subtractLocal;
    }

    private int multiply(int a, int b) {
        int multiplyLocal = a * b;
        return multiplyLocal;

    }

    private int division(int a, int b) {
        int divisionLocal = a / b;
        return divisionLocal;

    }


}
