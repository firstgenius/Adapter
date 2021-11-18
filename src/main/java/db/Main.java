package db;

import new_dp.Authorization;
import new_dp.Database;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization auth = new Authorization();
        if (auth.auth(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}