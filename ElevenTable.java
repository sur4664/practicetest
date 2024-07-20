package forloop;

public class ElevenTable {
   void mtd(){
       for (int i=1;i<=10;i++){
           int num = i*11;
           System.out.println("11 *"+i+"="+ num);
       }
    }




    public static void main (String []args){
        ElevenTable    ele = new ElevenTable() ;
        ele.mtd();
    }
}
