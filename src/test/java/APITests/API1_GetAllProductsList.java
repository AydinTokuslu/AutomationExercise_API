package APITests;

import base_urls.AutomationExerciseBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class API1_GetAllProductsList extends AutomationExerciseBaseUrl {
    /*
    API URL: https://automationexercise.com/api/productsList
    Request Method: GET
    Response Code: 200
    Response JSON: All products list
     */


    @Test
    public void get01() {
        // i) Set the URL
        spec.pathParam("first","productsList");
        // ii) Set the expected data(POST-PUT-PATCH)
        //get yapmıyacığımız için 2nci (ii) adımı atlıyoruz

        // iii) Type code to send request
        Response response = given().relaxedHTTPSValidation().spec(spec).contentType(ContentType.JSON).when().get("{first}");
        //response.htmlPath().prettify();

        //response.jsonPath().prettify();
        response.prettyPrint();
        //4. Step : Do assertion

        response.then().
                assertThat().
                statusCode(200).
                body("products.id",hasSize(43),
                        "products.brand", hasItem("Polo"), "products.name", hasItems("Men Tshirt", "Sleeveless Dress", "Stylish Dress"));




    }

}
