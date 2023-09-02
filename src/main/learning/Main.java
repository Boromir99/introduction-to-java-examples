package learning;

public class Main {
    public static void main(String[] args) {

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        System.out.println("tv1's channel is " + tv1.channel
                + " and volume level is " + tv1.volumeLevel);

    }
}