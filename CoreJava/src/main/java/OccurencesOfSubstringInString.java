

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class OccurencesOfSubstringInString {
    public static void main(String[] args) {
        BiConsumer<String,String> subStrOccurences=(str,substr)->{
            int count=0; int fromIndex=0;

            while((fromIndex=str.indexOf(substr,fromIndex))!=-1){
                System.out.println("Found at index:"+fromIndex);
                count++;
                fromIndex++;
            }
            System.out.println("Total occurence :"+count);
        };

        String str="manju is a man";
        String substr="man";
        subStrOccurences.accept(str,substr);
    }
}
