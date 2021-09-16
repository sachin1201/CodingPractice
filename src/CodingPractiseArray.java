public class CodingPractiseArray {

    public static void main(String[] args) {
        CodingPractiseArray object = new CodingPractiseArray();
        int[] arrInput = new int[]{2,5,0,1,7,3,0,5,0,8};
        int[] arrOutput = object.duplicateZeros(arrInput);

        for(int i = 0; i<arrOutput.length; i++) {
            System.out.print(arrOutput[i]);
        }
    }

    //perform in-place
    //arrINput = {2,5,0,1,7,3,0,5,0,8} -> {2,5,0,0,1,7,3,0,0,5}
    private int[] duplicateZeros(int[] arrInput) {
        for(int i = 0; i < arrInput.length; i++) {
            if(arrInput[i] == 0) {
                for(int j = arrInput.length-1; j > i+1; j--) {
                    arrInput[j] = arrInput[j-1];
                }
                arrInput[i+1] = 0;
                i++;
            }
        }
        return arrInput;
    }

    //arrInput = {-2,-1,0,2,4,5} -> {0,1,4,4,16,25}
    private int[] sortedSquare(int[] arrInput) {
        for(int i = 0; i<arrInput.length; i++) {
            arrInput[i] = arrInput[i]*arrInput[i];
        }
        for(int i = 0; i<arrInput.length; i++) {

        }

        return arrInput;
    }

}
