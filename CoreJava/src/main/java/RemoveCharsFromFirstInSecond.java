

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class RemoveCharsFromFirstInSecond {
    public static void main(String[] args) {
        BiConsumer<String,String> filter=(str1,str2)->{
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i< str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j))
                        str1=str1.substring(0,i)+'*'+str1.substring(i+1);
                }
            }
            for(int i=0;i<str1.length();i++)
            {
                if(str1.charAt(i)!='*')
                    stringBuilder.append(str1.charAt(i));
            }
            System.out.println(String.valueOf(stringBuilder));
        };


        String str1="jjkkambc";
        String str2="abc";
        filter.accept(str1,str2);
    }
}
