package APITests;

import base_urls.AutomationExerciseBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class API3_GetAllBrandsList extends AutomationExerciseBaseUrl {

    /*
    API URL: https://automationexercise.com/api/brandsList
Request Method: GET
Response Code: 200
Response JSON: All brands list
     */

    @Test
    public void get01() {
        // i) Set the URL
        spec.pathParam("first","brandsList");
        // ii) Set the expected data(POST-PUT-PATCH)


        // iii) Type code to send request
        Response response=given().spec(spec).contentType(ContentType.JSON).when().get("/{first}");
        response.prettyPrint();

        //4. Step : Do assertion

    }
}
