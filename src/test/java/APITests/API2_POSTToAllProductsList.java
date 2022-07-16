package APITests;

import base_urls.AutomationExerciseBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.AutomationExerciseTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class API2_POSTToAllProductsList extends AutomationExerciseBaseUrl {

    /*
    API URL: https://automationexercise.com/api/productsList
    Request Method: POST
    Response Code: 405
    Response Message: This request method is not supported.

    <html>
    <body>{"responseCode": 405, "message": "This request method is not supported."}</body>
    </html>
     */

    @Test
    public void get01() {
        // i) Set the URL
        spec.pathParam("first","productsList");
        // ii) Set the expected data(POST-PUT-PATCH)
        //get yapmıyacığımız için 2nci (ii) adımı atlıyoruz

        AutomationExerciseTestData expectedData=new AutomationExerciseTestData();
        Map<String, Object> expectedDataMap =expectedData.expectedDataWithAllKeys(405,"This request method is not supported.");

        // iii) Type code to send request
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedDataMap).when().post("{first}");
        response.prettyPrint();

        //4. Step : Do assertion
        HashMap actualDataMap= response.as(HashMap.class);
        assertEquals(expectedDataMap.get("responseCode"),actualDataMap.get("responseCode"));
        assertEquals(expectedDataMap.get("message"),actualDataMap.get("message"));

    }
}
