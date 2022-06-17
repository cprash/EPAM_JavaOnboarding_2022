
public class TestPermutationsOfAString {
    public static void printPermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char chi=str.charAt(i);

            String ros=str.substring(0,i)+str.substring(i+1);
            printPermutation(ros,ans+chi);
        }
    }
    public static void main(String[] args) {
        printPermutation("ABC","");

        }
    }

