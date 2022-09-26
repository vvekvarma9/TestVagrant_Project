package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJSON {
    public static JSONObject read() throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/resources/testData/TeamRCB.json");
        Object obj = jsonParser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
    }

    public static JSONArray getCustomData(String Key, String value, Boolean flag) throws IOException, ParseException {
        JSONObject jsonObject = ReadJSON.read();
        JSONArray player = (JSONArray) jsonObject.get("player");
        JSONArray foreignPlayers = new JSONArray();
        for (int i = 0; i < player.size(); i++) {
            JSONObject data = (JSONObject) player.get(i);
            if(flag)
                if (data.get(Key).equals(value)) {
                    foreignPlayers.add(player.get(i));
                }
            if(!flag)
                if (!data.get(Key).equals(value)) {
                    foreignPlayers.add(player.get(i));
                }
        }
        return foreignPlayers;
    }
}
