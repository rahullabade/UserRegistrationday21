package UserRegistrationDemo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPasswordSpecialCharacterWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.passwordSpecialCharacter();
        Assert.assertTrue(userTest);
    }
}
