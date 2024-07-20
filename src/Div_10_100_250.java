package forloop;
// WAP to display numbers 100 to 250 which are divisible by 10
public class Div_10_100_250 {
    void mtd() {
        try {
            for (int i = 100; i <= 250; i++) {
                if (i % 10 == 0) {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }
        public static void main(String[]args){
            Div_10_100_250 div10 = new Div_10_100_250();
            div10.mtd();
        }
    }










