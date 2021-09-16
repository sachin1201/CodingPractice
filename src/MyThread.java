public class MyThread extends Thread{
    int[] arr = {2,4,6,5,3};
    public void run() {
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]*2);
            arr[i] = arr[i]*2;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
    }

}
