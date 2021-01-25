package concepts;

import java.net.ServerSocket;

public class EnumDemo {
    public static void main(String[] args) {

        Database database = Database.MYSQL;

        System.out.println(database);
        //MYSQL

        Database[] databases= Database.values();
        for(Database db: databases){
            System.out.println(db);
            //toString
            System.out.println(db.ordinal());
            //index
        }

    }
}

enum Database {
    MYSQL,
    ORACLE,
    SQLSERVER;

}
