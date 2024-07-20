package forloop;
//WAp to display the count of even numbers between 1 and 50
public class Count {
    void  deb() {
        int count = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }System.out.println(count);
    }
        public static void main (String[]args){
            Count ct = new Count();
            ct.deb();
        }
    }