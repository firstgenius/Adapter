import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    MessageSender sender = new MessageSender();
    FacebookUser user;

    @BeforeEach
    void setUp() {
        user = new FacebookUser("yarosl@gmail.com", "Ukraine", "17:39");
    }

    @Test
    void send() {
        assertTrue(sender.send("what's up, bro", user, user.getCountry()));
    }
}