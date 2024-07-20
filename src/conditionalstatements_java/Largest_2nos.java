package conditionalstatements_java;
// to find the largest of the given two numbers
public class Largest_2nos {
    void l2n(int a,int b){
        try{
            if(a<b){
                System.out.println(a+" is the largest of the given two numbers");
            }else{
                System.out.println(b+" is the not the largest of the given two numbers");
            }

        }catch(Exception e){
            e.printStackTrace();{
            }


        }
    }




    public static void main(String []args){
        Largest_2nos no2 =new Largest_2nos();
        no2.l2n(3,1);
    }
}
