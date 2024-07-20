package conditionalstatements_java;
// Display number of digits available in the given number
public class Num_digits_givenNumber {
 void methoddigit (int digit) {

     if (digit <=9) {
         System.out.println(digit + " The given number has only one digit");
     } else if(digit <=99) {
         System.out.println(digit + " The given number has only two digit");
     }else if(digit <=999) {
         System.out.println(digit + " The given number has only three digit");
     }else

     {
         System.out.println(digit + " The given number has more than three digit");
     }
 }

    public static void main(String[]args){
        Num_digits_givenNumber NDG =  new Num_digits_givenNumber();
        NDG.methoddigit(2987);
    }
}
