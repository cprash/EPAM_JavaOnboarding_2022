
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class CountWords {
    public static void main(String[] args) {
        Function<String,Integer> countWords=(str)->{
            Set<String> set=new LinkedHashSet<>();
            String[] s = str.split(" ");
            for (String st:s) {
                System.out.println(st);
                set.add(st);
            }
            return set.size();
        };

        System.out.println("Number of words : "+countWords.apply("This is Rahul"));
    }
}
