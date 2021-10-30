package UserRegistrationDemo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstNameShouldWrittenTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.firstName();
        Assert.assertTrue(userTest);
    }
}
