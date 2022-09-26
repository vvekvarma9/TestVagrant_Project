package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import page.TeamRCBPage;

import java.io.IOException;

public class TeamRCBSteps {
    public TeamRCBPage teamRCBPage;
    public TeamRCBSteps(TeamRCBPage teamRCBPage) {
        this.teamRCBPage = teamRCBPage;
    }
    @Given("User getting the data from Json file")
    public void user_getting_the_data_from_json_file() throws IOException, ParseException {
        teamRCBPage.gettingJsonData();
    }
    @When("User retrieving the foreign players data")
    public void user_retrieving_the_foreign_players_data() throws IOException, ParseException {
        teamRCBPage.retrievingForeignPlayersData();
    }
    @Then("User validating the team has only {int} foreign players")
    public void user_validating_the_team_has_only_foreign_players(int player) throws IOException, ParseException {
        teamRCBPage.validatingForeignPlayers(player);
    }
    @When("User retrieving the wicket keeper's data")
    public void user_retrieving_the_wicket_keeper_s_data() throws IOException, ParseException {
        teamRCBPage.retrievingWicketKeeperData();
    }
    @Then("User validating the team has {int} wicket keeper")
    public void user_validating_the_team_has_wicket_keeper(int player) throws IOException, ParseException {
        teamRCBPage.validatingWicketKeeper(player);
    }
}
