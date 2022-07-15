package APITests;

import base_urls.AutomationExerciseBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
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

        Map<String,Object> expectedData=new HashMap<>();
        expectedData.put("responseCode",405);
        expectedData.put("message","This request method is not supported.");

        // iii) Type code to send request
        Response response = given().spec(spec).when().post("{first}");
        response.prettyPrint();

        Map<String, Object> actualData = response.as(HashMap.class);//de-serialization yaptık
        System.out.println(actualData);

        //4. Step : Do assertion
        response.then().
                assertThat().
                statusCode(200);


        assertEquals("responseCode",response.statusCode());



    }
}
