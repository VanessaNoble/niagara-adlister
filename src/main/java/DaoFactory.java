//INSERT PACKAGE ADLISTER
/**
 * Created by vanessamnoble on 2/1/17.
 */


public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao; //return instances to users data access object
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;  //return instances to users data access object
    }
}

