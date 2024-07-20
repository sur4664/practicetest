package conditionalstatements_java;
//verify the given number is divisible by 7
public class Div_7 {
    void d_7(int number){
        if( number%7==0){
            System.out.println(number+ " is divisible by 7");
        }else{
            System.out.println(number + " is not divisible bby 7");
        }
}

    public static void main(String []args){
        Div_7 d7 = new Div_7();
        d7.d_7(7);
    }
}
