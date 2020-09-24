package steps;

import POJO.Address;
import POJO.Company;
import POJO.Geo;
import POJO.Users;
import io.cucumber.java.en.When;
import utilities.DataFaker;
import utilities.RestAssuredExtension;

import static globalVariables.globals.*;

public class PostNewPostSteps {

    Users users = new Users();
    Address address = new Address();
    Geo geo = new Geo();
    Company company = new Company();

    @When("I send {string} request to create new user using faker")
    public void iSendRequestToCreateNewUserUsingFaker(String method) {

        DataFaker dataFaker = new DataFaker();

        users.setId(dataFaker.getId());
        users.setName(dataFaker.getName());
        users.setUsername(dataFaker.getUsername());
        users.setEmail(dataFaker.getEmail());
        users.setPhone(dataFaker.getPhone());
        company.setName(dataFaker.getCompName());
        address.setStreet(dataFaker.getStreet());
        address.setSuite(dataFaker.getSuite());
        address.setCity(dataFaker.getCity());
        address.setZipcode(dataFaker.getZipcode());
        geo.setLat(dataFaker.getLat());
        geo.setLng(dataFaker.getLng());
        address.setGeo(geo);
        users.setAddress(address);
        users.setCompany(company);

        restAssuredExtension = new RestAssuredExtension(endPointURI, method, null);
        responseOptions = restAssuredExtension.ExecuteWithBody(users);
    }
}
