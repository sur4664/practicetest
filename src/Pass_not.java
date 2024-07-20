public class Pass_not {
     void pass(int marks) {
        if ((marks < 35)) {
            System.out.println(marks + " as failed");
        } else {
            if ((marks > 35)) {
                System.out.println(marks + " as passed");
            }
        }
    }


    public static void main(String[] args) {
        Pass_not pnf = new Pass_not();
        pnf.pass(50);

    }
}
