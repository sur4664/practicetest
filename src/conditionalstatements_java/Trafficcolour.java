package conditionalstatements_java;

public class Trafficcolour {
    void smd(String colour) {

        switch (colour) {
            case "red":
                System.out.println( colour+ " is STOP");
                break;
            case "yellow":
                System.out.println( colour+ " is  GET READY");
                break;
            case "green":
                System.out.println( colour +" is GO");
                break;
            default:System.out.println(colour +"  is not a traffic signal colour");
        }
    }

    public static void main(String[] args) {
        Trafficcolour tc = new Trafficcolour();
        tc.smd("pink");
    }
}
