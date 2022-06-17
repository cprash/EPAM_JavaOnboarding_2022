

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MaximumOccuringCharacterInString {
    public static void main(String[] args) {

        Consumer<String> maximumOcc=(str)->{
            Map<Character,Integer> dupCountMap=new LinkedHashMap<>();
            for(int i=0;i<str.length();i++){
                char charAti= str.charAt(i);
                if(dupCountMap.containsKey(charAti)){
                    dupCountMap.put(charAti,dupCountMap.get(charAti)+1);
                }
                else dupCountMap.put(charAti,1);
            }
            System.out.println(dupCountMap);
            Integer max = Collections.max(dupCountMap.values());
            Character maxOccCHar=null;
            for (Map.Entry<Character,Integer> mpEn:dupCountMap.entrySet()) {
                if(mpEn.getValue()==max)
                    maxOccCHar=mpEn.getKey();
            }
            System.out.println(maxOccCHar);
        };



        String duplicate="abcdddett";
        maximumOcc.accept(duplicate);

    }


}
