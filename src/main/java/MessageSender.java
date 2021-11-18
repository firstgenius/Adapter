import users.User;

import java.util.Objects;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (Objects.equals(user.getCountry(), country) && !Objects.equals(user.getActiveTime(), null)) {
            System.out.println("All good");
            return true;
        } else {
            return false;
        }
    }
}