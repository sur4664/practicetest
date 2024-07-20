package forloop;
//WAp to display even numbers in between 1 to  50 using for loop
public class Display_Even_inbw_1_50 {
     void  deb() {
         for ( int i = 0; i <= 50; i=i + 2) {
             System.out.println(i +" are the even numbers between 1 and 50");
         }
     }








    public static void main(String[]args){
        Display_Even_inbw_1_50 d1_50 =new Display_Even_inbw_1_50();
        d1_50.deb();
    }
}
