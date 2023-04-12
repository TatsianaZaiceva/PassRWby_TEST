package PassRwBy.tests.ui.data;

import com.github.javafaker.Faker;

public class UserData {
    static Faker faker = new Faker();
    public static final String USER_LOGIN = "vorozay";
    public static final String USER_PASSWORD = "3y00xv0f";
    public static final String EMPTY_LOGIN = "";
    public static final String EMPTY_PASSWORD = "";
    public static final String RANDOM_EMAIL = faker.internet().emailAddress();
    public static final String RANDOM_PASSWORD = faker.internet().password(5,12,
                                                                        true, true);
    public static final String USER_FIRST_NAME = "Дмитрий";
    public static final String USER_MIDDLE_NAME = "Андреевич";
    public static final String USER_LAST_NAME = "Воробьёв";
    public static final String USER_DOCUMENT = "НВ1234567";
}
