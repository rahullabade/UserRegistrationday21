package UserRegistrationDemo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenLastNameShouldWrittenTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.lastName();
        Assert.assertTrue(userTest);
    }
}
