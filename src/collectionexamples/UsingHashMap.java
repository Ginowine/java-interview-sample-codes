package collectionexamples;

import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {
    public static void main(String args[]){
        Map<Integer, String> errorInfo  = new HashMap<>();

        errorInfo.put(200, "OK");
        errorInfo.put(500, "Not cool");
        errorInfo.put(600, "Never cool");
        errorInfo.put(150, "Checking");

        System.out.println(errorInfo);

    }
}
