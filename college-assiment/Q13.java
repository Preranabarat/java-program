interface Camera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4k() {
        greet();
        System.out.println("Recording 4k video....");
    }

}

interface wifi {
    String[] getNetworks();

    void connectToNetworks(String network);
}

class MyCellPhone {
    void callNumber() {
        System.out.println("Calling....");
    }

    void pickCall() {
        System.out.println("Connecting....");
    }
}

class mySmartPhone extends MyCellPhone implements Camera, wifi {
    public void takeSnap() {
        System.out.println("Capturing your picture....");
    }

    public void recordVideo() {
        System.out.println("Start recording video...");
    }

    public String[] getNetworks() {
        String[] networkList = { "Harry", "Prerana", "Shukla", "Zoe" };
        return networkList;
    }

    public void connectToNetworks(String network) {

    }

    // public void record4k(){
    // System.out.println("Recording 4k video and taking snap....");
    // }
}

public class Q13 {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String[] arr = ms.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }

        ms.record4k();
        ms.callNumber();
    }
}