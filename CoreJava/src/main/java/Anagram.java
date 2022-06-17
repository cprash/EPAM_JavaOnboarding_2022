

import java.util.Arrays;
import java.util.function.BiFunction;

import static java.util.Collections.sort;


public class Anagram {
    public static void main(String[] args) {
        BiFunction<String,String,Boolean> anagram=(str1,str2)->{
            if(str1.length()!=str1.length())
                return false;
            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            str1=new String(ch1);
            str2=new String(ch2);
            System.out.println(str1);
            System.out.println(str2);
            if(str1.equalsIgnoreCase(str2))
                return true;
            else return false;
        };

        String str1="listen";
        String str2="silent";
        if(anagram.apply(str1,str2))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
    }
}
