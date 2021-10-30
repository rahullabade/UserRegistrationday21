package UserRegistrationDemo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPhoneNumberWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.phoneNumber();
        Assert.assertTrue(userTest);
    }
}
