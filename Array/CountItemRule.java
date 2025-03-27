import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CountItemRule {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> itemsList = new ArrayList<>(
            Arrays.asList(
                new ArrayList<>(Arrays.asList("phone", "blue", "pixel")),
                new ArrayList<>(Arrays.asList("computer", "silver", "lenovo")),
                new ArrayList<>(Arrays.asList("phone", "gold", "iphone"))
            )
        );
        
        String ruleKey = "type";
        String ruleValue = "phone";

        Solutionb sol = new Solutionb();
        int ans = sol.countMatches((List)itemsList, ruleKey, ruleValue);
        System.out.println(ans); // Expected output: 2
    }
}

class Solutionb {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        } else {
            return 0; // Invalid ruleKey case
        }

        int output = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                output++;
            }
        }
        return output;
    }
}
