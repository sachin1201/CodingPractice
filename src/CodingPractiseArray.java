public class CodingPractiseArray {

    public static void main(String[] args) {
        CodingPractiseArray object = new CodingPractiseArray();
        int[] arrInput = new int[]{-2, -1, 0, 2, 4, 5, 4, 3, 2,2};
        boolean doesExist = object.isStrictMountainArray(arrInput);
        System.out.println("It is a mountain array: " + doesExist);

//        int[] arrOutput = object.sortedSquare(arrInput);
//        for (int i = 0; i < arrOutput.length; i++) {
//            System.out.print(arrOutput[i] + ", ");
//        }
    }

    //perform in-place
    //arrINput = {2,5,0,1,7,3,0,5,0,8} -> {2,5,0,0,1,7,3,0,0,5}
    private int[] duplicateZeros(int[] arrInput) {
//        TC : o(2n) = o(n)
        int counter = 0;
        for (int i = 0; i < arrInput.length - counter; i++) {
            if (arrInput[i] == 0) {
                counter++;
            }
        }
        int effectiveLength = arrInput.length - counter;
        int k = arrInput.length - 1;
        for (int i = effectiveLength - 1; i >= 0; i--, k--) {
            arrInput[k] = arrInput[i];
            if (arrInput[k] == 0) {
                arrInput[k - 1] = 0;
                k--;
            }
        }
        return arrInput;
    }

    //U can use another array for output
    //arrInput = {-2,-1,0,2,4,5} -> {0,1,4,4,16,25}
    private int[] sortedSquare(int[] arrInput) {
        int start = 0;
        int end = arrInput.length - 1;
        int k = arrInput.length - 1;
        int[] arrOutput = new int[arrInput.length];
        while (start < end) {
            if (arrInput[start] * arrInput[start] > arrInput[end] * arrInput[end]) {
                arrOutput[k] = arrInput[start] * arrInput[start];
                start++;
                k--;
            } else if (arrInput[start] * arrInput[start] < arrInput[end] * arrInput[end]) {
                arrOutput[k] = arrInput[end] * arrInput[end];
                end--;
                k--;
            } else {
                arrOutput[k] = arrInput[start] * arrInput[start];
                k--;
                arrOutput[k] = arrInput[start] * arrInput[start];
                k--;
                start++;
                end--;
            }
        }
        return arrOutput;
    }


    //arrInput = {2,4,5,7,8,9,10,12,13,14}, 7 => true
    //Binary search
    //TC : o(log(n))
    private boolean searchInSortedArray(int[] arrInput, int key) {
        int start = 0;
        int end = arrInput.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arrInput[mid] == key) {
                System.out.println(mid);
                return true;
            } else if (arrInput[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    //arrInput = {-2,-1,0,2,4,5, 4,3,2} => true
    //means for every arrInput[i] > arrInput[i-1] till index k and after k arrInput[i] < arrInput[i-1]
    private boolean isStrictMountainArray(int[] arrInput) {
        int i = 0;
        while (arrInput[i] < arrInput[i + 1]) {
            i++;
        }
        int j = arrInput.length - 1;
        while (arrInput[j] < arrInput[j - 1]) {
            j--;
        }
        if (i == j) {
            return true;
        } else {
            return false;
        }
    }

}
