package PassRwBy.tests.api;

import com.github.javafaker.Faker;

public class ApiData {
    static Faker faker = new Faker();
    public static final String BASE_URL = "https://pass.rw.by/ru";
    public static final String VALID_LOGIN = "vorozay";
    public static final String VALID_PASSWORD = "3y00xv0f";
    public static final String RANDOM_EMAIL = faker.internet().emailAddress();
    public static final String RANDOM_PASSWORD = faker.internet().password(7, 12);
    public static final String TEXT_SEARCH = "Минск";
}
