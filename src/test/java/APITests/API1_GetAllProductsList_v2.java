package APITests;

import base_urls.AutomationExerciseBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class API1_GetAllProductsList_v2 extends AutomationExerciseBaseUrl {

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
        Response response = given().spec(spec).contentType(ContentType.JSON).when().get("{first}");
        response.prettyPrint();
        //4. Step : Do assertion
        response.then().
                assertThat().
                statusCode(200).
                contentType("text/html; charset=utf-8").
                statusLine("HTTP/1.1 200 OK");




    }

}
