package APITests;

import base_urls.AutomationExerciseBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class API4_PUTToAllBrandsList extends AutomationExerciseBaseUrl {

    /*
    API URL: https://automationexercise.com/api/brandsList
    Request Method: PUT
    Response Code: 405
    Response Message: This request method is not supported.
     */

    @Test
    public void put01() {
        // i) Set the URL
        spec.pathParam("first","brandsList");
        // ii) Set the expected data(POST-PUT-PATCH)


        // iii) Type code to send request
        Response response=given().spec(spec).contentType(ContentType.JSON).when().put("/{first}");
        response.prettyPrint();

        //4. Step : Do assertion

    }
}
