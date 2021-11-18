package twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import users.User;

@AllArgsConstructor @Getter @Setter
public class TwitterUser implements User {
    private String email;
    private String country;
    private String activeTime;

}