package conditionalstatements_java;

public class Large_3Num {
    void l3n(int a,int b,int c){
        try{
            if((a>b) && (a>c)){
                System.out.println(a+" is the largest of the given three numbers");
            }else if((b>c) && (b>c)){
                System.out.println(b+" is the largest of the given three numbers");
            }else if((c>b) && (c>b)){
                System.out.println(c+" is the largest of the given three numbers");
            }else{
                System.out.println("  the given numbers is invalid");
            }

        }catch(Exception e){
            e.printStackTrace();{
            }


        }
    }

    public static void main(String []args){
        Large_3Num  lrg3 = new Large_3Num();
        lrg3.l3n(1,2,3);
    }
}
