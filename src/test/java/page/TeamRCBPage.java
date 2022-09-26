package page;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import utils.CommonUtilities;
import utils.ReadJSON;

import java.io.IOException;

public class TeamRCBPage {
    public ReadJSON readJSON;
    public TeamRCBPage(ReadJSON readJSON) {
        this.readJSON = readJSON;
    }
    public void gettingJsonData() throws IOException, ParseException {

        JSONObject jsonObject = ReadJSON.read();
        JSONArray player = (JSONArray) jsonObject.get("player");
        CommonUtilities.printJson(player);
    }
    public void retrievingForeignPlayersData() throws IOException, ParseException {
        JSONArray foreignPlayers = ReadJSON.getCustomData("country","India", false);
        System.out.println("Foreign Players :" +foreignPlayers);
    }
    public void validatingForeignPlayers(int player) throws IOException, ParseException {
        JSONArray foreignPlayers = ReadJSON.getCustomData("country","India", false);
        Assert.assertEquals(player,foreignPlayers.size());
    }
    public void retrievingWicketKeeperData() throws IOException, ParseException{
        JSONArray wicketKeeper = ReadJSON.getCustomData("role","Wicket-keeper", true);
        System.out.println("wicket keepers :" +wicketKeeper);
    }
    public void validatingWicketKeeper(int player) throws IOException, ParseException{
        JSONArray wicketKeeper = ReadJSON.getCustomData("role","Wicket-keeper", true);
        Assert.assertEquals(player,wicketKeeper.size());
    }
}
