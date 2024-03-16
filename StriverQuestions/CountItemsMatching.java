package StriverQuestions;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class CountItemsMatching {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        CountItemsMatching solution = new CountItemsMatching();
        int count = solution.countMatches(items, "type", "phone");
        System.out.println("Count: " + count);
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        if("type".equals(ruleKey)){
            index = 0;
        }else if("color".equals(ruleKey)){
            index = 1;
        }else{
            index = 2;
        }
        for(int i = 0; i < items.size();i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
