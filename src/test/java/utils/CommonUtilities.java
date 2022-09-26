package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CommonUtilities {
    public static void printJson(JSONArray jsonArray) {
        for (int i = 0; i < jsonArray.size(); i++) {
            System.out.println("\n-------");
            JSONObject data = (JSONObject) jsonArray.get(i);
            System.out.println("name : " + data.get("name"));
            System.out.println("country : " + data.get("country"));
            System.out.println("role : " + data.get("role"));
            System.out.println("price-in-crores : " + data.get("price-in-crores"));
        }
    }
}
