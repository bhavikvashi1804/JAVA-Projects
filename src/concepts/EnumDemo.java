package concepts;

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

enum PaymentType{
    DEBITCARD(5),
    CREDITCARD(10),
    CASH(1);

    int fee;

    PaymentType(int fee){
        this.fee = fee;
    }

    public int getFee(){
        return this.fee;
    }
}
