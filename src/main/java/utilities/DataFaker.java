package utilities;

import com.github.javafaker.Faker;

public class DataFaker {

    private static Faker faker = new Faker();

    public int getUserID()
    {
        int userId = faker.number().randomDigitNotZero();
        return userId;
    }

    public int getId()
    {
        int id = faker.number().randomDigitNotZero();
        return id;
    }

    public String getTitle()
    {
        String title = faker.gameOfThrones().quote();
        return title;
    }

    public String getBody()
    {
        String body = faker.friends().quote();
        return body;
    }

    public String getPhone()
    {
        String phone = faker.numerify("01#########");
        return phone;
    }

    public String getName()
    {
        String name = faker.funnyName().name();
        return name;
    }

    public String getUsername()
    {
        String username = faker.name().username();
        return username;
    }

    public String getEmail()
    {
        String email = faker.internet().emailAddress();
        return email;
    }

    public String getStreet()
    {
        String street = faker.address().streetName();
        return street;
    }

    public String getSuite()
    {
        String suite = faker.address().streetAddressNumber();
        return suite;
    }

    public String getCity()
    {
        String city = faker.address().city();
        return city;
    }

    public String getZipcode()
    {
        String zipcode = faker.address().zipCode();
        return zipcode;
    }

    public String getLat()
    {
        String lat = faker.address().latitude();
        return lat;
    }

    public String getLng()
    {
        String lng = faker.address().longitude();
        return lng;
    }

    public String getCompName()
    {
        String compName = faker.superhero().name();
        return compName;
    }
}
