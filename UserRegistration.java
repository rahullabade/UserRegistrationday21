package UserRegistrationDemo;

import java.util.regex.Pattern;

public class UserRegistration {
        public boolean phoneNumber() {
            boolean matchesString = Pattern.matches("^[0-9]{2}[ ][789]{1}[0-9]{9}$", "91 8390970948");
            return matchesString;
        }
}
