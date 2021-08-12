package Wrestler;

public class StoneCold implements Wrestler {

    public void themeMusic() {
        System.out.println("Stone Cold's intro music");
    }

    public void finisher() {
        System.out.println("Stone Cold Stunner");
    }

    public void paymentForWork(int hours){
        System.out.println("Kane will make $" + hours*400 + " for this match");
    }
}
