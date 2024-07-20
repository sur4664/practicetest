package conditionalstatements_java;

public class Verify_char_Vowel_Or_Not {
    void vowel(char ch){
        if((ch =='a') && (ch =='A')){
            System.out.println(ch +" is an vowel ");
        }else if((ch =='e') && (ch =='E')) {
            System.out.println(ch + " is an vowel ");
        }else if((ch =='i') && (ch =='I')) {
            System.out.println(ch + " is an vowel ");
        }else if((ch =='o') && (ch =='O')) {
            System.out.println(ch + " is an vowel ");
        }else if((ch =='u') && (ch =='U')) {
            System.out.println(ch + " is an vowel ");
        }else{
            System.out.println(ch+" is not an vowel");
        }
    }

    public static void main(String []args){
        Verify_char_Vowel_Or_Not VcVon = new Verify_char_Vowel_Or_Not();
        VcVon.vowel('F');
    }
}
