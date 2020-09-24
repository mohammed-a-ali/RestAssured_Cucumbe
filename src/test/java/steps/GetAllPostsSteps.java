package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.RestAssuredExtension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static globalVariables.globals.endPointURI;
import static globalVariables.globals.*;

public class GetAllPostsSteps {
    @When("I send {string} request")
    public void iSendRequest(String method) {
        restAssuredExtension = new RestAssuredExtension(endPointURI, method, null);
        responseOptions = restAssuredExtension.ExecuteAPI();
    }

    @Then("I should get {int} posts")
    public void iShouldGetPosts(int ids) {
        List list = responseOptions.getBody().jsonPath().getList("id");
        int lastId = (int) list.get(list.size() - 1);
        Assert.assertEquals(ids, lastId);
    }

    @When("I send {string} request with these parameters to get posts")
    public void iSendRequestWithTheseParametersToGetPosts(String method, DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        HashMap<String, Object> params = new HashMap<>();
        params.put("id", data.get(0).get("id"));

        restAssuredExtension = new RestAssuredExtension(endPointURI, method, null);
        responseOptions = restAssuredExtension.ExecuteWithParams(params);
    }
}
