import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import models.Character;

public class ApplaudoStudioTest {

    public static final String baseUri = "https://www.breakingbadapi.com/api/";
    private static RequestSpecification request;

    @BeforeClass
    private void setUp(){
        RestAssured.defaultParser = Parser.JSON;
        RestAssured.baseURI = baseUri;
        request = RestAssured.given();
    }

    @Test
    public void givenWalterWhiteCharacterThenPrintBirthday() {
        final int walterWhiteId = 1;

        Response response = request.get("/characters/" + walterWhiteId)
                .then().statusCode(200)
                .extract().response();

        JsonPath jsonData = response.jsonPath();
        Assert.assertTrue(jsonData.getString("name").equalsIgnoreCase("[Walter White]"));
        System.out.println("Birthday of Walter White is: " + jsonData.getString("birthday"));
    }

    @Test
    public void givenAllCharacterThenPrintAllInPOJO() throws IOException {

        Response response = request.get("/characters")
                .then().statusCode(200)
                .extract().response();

        Character[] returnedCharacters = response.getBody().as(Character[].class);
        Assert.assertNotEquals(returnedCharacters.length, 0);
        for(Character character:  returnedCharacters){
            System.out.println(character);
        }
    }
}

