import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.comparesEqualTo;

public class GetSingleUser {
    @Test
    public void testGetSingleUser() {
        given().
                when().get("https://reqres.in/api/users/2").then().
                assertThat().statusCode(200).
                body("data.id", comparesEqualTo(2));
    }

}
