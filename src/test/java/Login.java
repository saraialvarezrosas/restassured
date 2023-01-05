//import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

public class Login {
    @Test
    public void logintest() {
        String responsee =  RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"username\": \"sarai1234\",\n" +
                        "    \"password\": \"1234sarai\"\n" +
                        "}")
                .post("https://test-api.k6.io/auth/basic/login/")
                .then()
                .log()
                .all()
                .extract()
                .asString();
        System.out.println(responsee);
    }
}
