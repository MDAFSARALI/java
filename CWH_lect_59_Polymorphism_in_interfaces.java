interface camera {
    void takeSnap();

    void recordVideo();

    default void record4k() {
        System.out.println("Recording in 4k");
    }
}

interface wifi {
    String[] getNetwork(String network);
}

class cellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    void pickCall(int phoneNumber) {
        System.out.println("Connecting....");
    }

}

class smartPhone extends cellPhone implements wifi, camera {
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    public void recordVideo() {
        System.out.println("Recording the video....");
    }

    public String[] getNetwork(String Network) {
        System.out.println("Getting list of networks...");
        String[] NetworkList = { "Harry", "Afsar", "Afzal" };
        return NetworkList;
    }

    public void connectTonetwork(String Network) {
        System.out.println("connecting to" + Network);
    }

    public void record4k() {
        System.out.println("Taking snap and recording in 4k");
    }
    public void samplemeth(){
        System.out.println("It is the sample method...");
    }

}

public class CWH_lect_59_Polymorphism_in_interfaces {
    public static void main(String[] args) {
        camera cam1=new smartPhone();// This is a smart phone but use it as a camera...
        // We can only use the functions of referance (camera) but object is created of smartphone...
        // cam1.getNetwork();--------->This is not allowed or reflect an error...
        cam1.takeSnap();
        cam1.record4k();
        smartPhone s=new smartPhone();
        s.samplemeth();
        s.record4k();
        s.recordVideo();
        s.getNetwork("Afsar");
        s.callNumber(122);
        s.connectTonetwork(" Afzal");
    }
}
