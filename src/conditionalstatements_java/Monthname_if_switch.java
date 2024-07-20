package conditionalstatements_java;

public class Monthname_if_switch {
  void fif(int d){

      if(d==1){
          System.out.println(d + " january");
      }else if (d==2){
          System.out.println(d + " february");
      }else if (d==3){
          System.out.println(d + " march");
      }else if (d==4){
          System.out.println(d + " april");
      }else if (d==5){
          System.out.println(d + " may");
      }else if (d==6){
          System.out.println(d + " june");
      }else if (d==7){
          System.out.println(d + " july");
      }else if (d==8){
          System.out.println(d + " august");
      }else if (d==9){
          System.out.println(d + " september");
      }else if (d==10){
          System.out.println(d + " october");
      }else if (d==11){
          System.out.println(d + " november");
      }else if (d==12){
          System.out.println(d + " december");
      }else{
          System.out.println(d +" number is not a month number");
      }

  }
    void smd(int x){

        switch (x){
            case 1: System.out.println( x +" is january");break;
            case 2: System.out.println( x +" is february");break;
            case 3 : System.out.println( x +" is march");break;
            case 4 : System.out.println( x +" is april");break;
            case 5 : System.out.println( x +" is may");break;
            case 6 : System.out.println( x +" is june");break;
            case 7 : System.out.println( x +" is july");break;
        case 8 : System.out.println( x +" is august");break;
        case 9 : System.out.println( x +" is september");break;
        case 10 : System.out.println( x +" is october");break;
        case 11: System.out.println( x +" is november");break;
        case 12: System.out.println( x +" is december");break;
        }

    }

    public static void main(String[]args){
        Monthname_if_switch mis = new Monthname_if_switch();
                     mis.fif(6);
                     mis.smd( 7);


    }
}
