

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;

public class DuplicatesInStringAndTheirCOunt {
    public static void main(String[] args) {

        Consumer<String> duplicteChars=(str)->{
            Map<Character,Integer> dupCountMap=new LinkedHashMap<>();
            for(int i=0;i<str.length();i++){
                char charAti= str.charAt(i);
                if(dupCountMap.containsKey(charAti)){
                    dupCountMap.put(charAti,dupCountMap.get(charAti)+1);
                }
                else dupCountMap.put(charAti,1);
            }
            System.out.println(dupCountMap);
        };



        String duplicate="abcddett";
        duplicteChars.accept(duplicate);

    }


}
