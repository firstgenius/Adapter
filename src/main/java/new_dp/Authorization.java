package new_dp;

import db.Авторизація;

public class Authorization extends Авторизація {
    public boolean auth(Database db){
        db.getUserData();
        return true;
    }
}
