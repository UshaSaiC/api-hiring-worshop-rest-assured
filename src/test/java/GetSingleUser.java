import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.comparesEqualTo;

public class GetSingleUser {

    @Test
    public void testGetSingleUserandExtractResponse(){
        Response response=given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users/2").then().
                assertThat().statusCode(200).and().extract().response();
    System.out.println("response of the list user API is  "+response.asString());
    }

    @Test
    public void testGetSingleUser(){
        given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users/2").then().
                assertThat().statusCode(200).body("data.id", comparesEqualTo(2));
    }
}
