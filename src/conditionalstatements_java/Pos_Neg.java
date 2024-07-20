package conditionalstatements_java;
//verify the given number is +ve or  -ve
public class Pos_Neg {
    void posneg(int i){
        if(i>=0){
            System.out.println(i+" is a +ve number");
        }else{
            System.out.println(i+" is a -ve number");
        }
    }



    public static void main(String[] args){
        Pos_Neg pong =  new Pos_Neg();
        pong.posneg(0);
    }
}
