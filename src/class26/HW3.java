package class26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class HW3 {
    public static void main(String[] args) {
        LinkedHashSet<String> objects = new LinkedHashSet<>();
        objects.add("J.A.P.A.N: ");
        objects.add("Just ");
        objects.add("always ");
        objects.add("pray ");
        objects.add("at ");
        objects.add("night.");

        StringBuilder result = new StringBuilder();
        for ( String str : objects){
            result.append(str);
        }
        System.out.println(result);
    }
}
