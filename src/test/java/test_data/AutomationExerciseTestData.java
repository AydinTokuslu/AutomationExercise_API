package test_data;

import java.util.HashMap;
import java.util.Map;

public class AutomationExerciseTestData {

    public Map<String, Object> expectedDataWithAllKeys(Integer responseCode, String message){

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("responseCode", responseCode);
        expectedData.put("message", message);


        return expectedData;

    }
}
