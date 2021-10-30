package UserRegistrationDemo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPasswordOneNumericWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.passwordOneNumeric();
        Assert.assertTrue(userTest);
    }
}
