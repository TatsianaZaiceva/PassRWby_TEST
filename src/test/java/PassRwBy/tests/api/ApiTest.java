package PassRwBy.tests.api;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ApiTest {
    JSONObject jsonObject = new JSONObject();

    @Test
    @DisplayName("Получение ответа 200")
    public void testGetRequest200() {
        when()
                .get(ApiData.BASE_URL)
            .then()
                .statusCode(200);
    }
    @Test
    @DisplayName("Авторизация зарегистрированного пользователя")
    public void testLoginWithValidData() {
        jsonObject.put("Логин/E-mail", ApiData.VALID_LOGIN);
        jsonObject.put("Пароль", ApiData.VALID_PASSWORD);
        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(jsonObject.toString()).
            when().
                post(ApiData.BASE_URL + "/?autologout=true").
            then().
                log().body().
                assertThat().
                statusCode(200);
    }
    @Test
    @DisplayName("Авторизация незарегистрированного пользователя")
    public void testLoginWithRandomData() {
        jsonObject.put("Логин/E-mail", ApiData.RANDOM_EMAIL);
        jsonObject.put("Пароль", ApiData.RANDOM_PASSWORD);
        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(jsonObject.toString()).
            when().
                post(ApiData.BASE_URL + "/?autologout=true").
            then().
                log().body().
                assertThat().
                statusCode(200);
    }
    @Test
    @DisplayName("Поисковая строка")
    public void testSearchProduct() {
        given().
                queryParam("search", ApiData.TEXT_SEARCH).
            when().
                get(ApiData.BASE_URL + "/search").
            then().
                assertThat().
                statusCode(200);
    }
}

